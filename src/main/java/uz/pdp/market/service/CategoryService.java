package uz.pdp.market.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.market.dto.category.CategoryCreateDto;
import uz.pdp.market.dto.category.CategoryDto;
import uz.pdp.market.dto.category.CategoryUpdateDto;
import uz.pdp.market.dto.response.AppErrorDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.entity.market.Category;
import uz.pdp.market.mapper.CategoryMapper;
import uz.pdp.market.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements AbstractService {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public ResponseEntity<DataDto<List<CategoryDto>>> getAll() {
        List<Category> factories = repository.findAllByDeletedFalse();
        return new ResponseEntity<>(new DataDto<>(mapper.toDto(factories), (long) factories.size()), HttpStatus.OK);
    }

    public ResponseEntity<DataDto<CategoryDto>> get(Long id) {
        Optional<Category> categoryOptional = repository.findByIdAndDeletedFalse(id);
        if (categoryOptional.isEmpty())
            return new ResponseEntity<>(new DataDto<>(AppErrorDto.builder().build()), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new DataDto<>(mapper.toDto(categoryOptional.get())), HttpStatus.OK);
    }

    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        Optional<Category> optionalCategory = repository.findByIdAndDeletedFalse(id);
        if (optionalCategory.isEmpty())
            return new ResponseEntity<>(new DataDto<>(AppErrorDto
                    .builder()
                    .status(HttpStatus.NOT_FOUND)
                    .build()
            ), HttpStatus.NOT_FOUND);
        repository.delete(optionalCategory.get());
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<DataDto<Boolean>> create(CategoryCreateDto dto) {
        Category category = mapper.fromCreateDto(dto);
        repository.save(category);
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.CREATED);
    }

    public ResponseEntity<DataDto<Boolean>> update(CategoryUpdateDto dto) {
        Optional<Category> categoryOptional = repository.findByIdAndDeletedFalse(dto.getId());
        if (categoryOptional.isEmpty()) {
            return new ResponseEntity<>(new DataDto<>(AppErrorDto
                    .builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message("Category not found by id : '%s'".formatted(dto.getId()))
                    .build()
            ), HttpStatus.CONFLICT);
        }

        Category category = mapper.fromUpdateDto(dto, categoryOptional.get());

        repository.save(category);

        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.ACCEPTED);
    }
}
