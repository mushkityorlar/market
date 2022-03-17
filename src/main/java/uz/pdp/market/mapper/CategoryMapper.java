package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.category.CategoryCreateDto;
import uz.pdp.market.dto.category.CategoryDto;
import uz.pdp.market.dto.category.CategoryUpdateDto;
import uz.pdp.market.entity.market.Category;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CategoryMapper extends BaseMapper<
        Category,
        CategoryDto,
        CategoryCreateDto,
        CategoryUpdateDto> {
    @Override
    CategoryDto toDto(Category category);

    @Override
    List<CategoryDto> toDto(List<Category> e);

    @Override
    Category fromCreateDto(CategoryCreateDto categoryCreateDto);

    @Override
    Category fromUpdateDto(CategoryUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category fromUpdateDto(CategoryUpdateDto d, @MappingTarget Category category);
}
