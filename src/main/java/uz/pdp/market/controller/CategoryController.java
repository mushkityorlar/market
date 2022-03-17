package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.category.CategoryCreateDto;
import uz.pdp.market.dto.category.CategoryDto;
import uz.pdp.market.dto.category.CategoryUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.category.CategoryService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoryController extends AbstractController<CategoryService> {

    public CategoryController(CategoryService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/category", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Boolean>> create(@Valid @RequestBody CategoryCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/category", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<CategoryDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<CategoryDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/category", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody CategoryUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/category/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }

}
