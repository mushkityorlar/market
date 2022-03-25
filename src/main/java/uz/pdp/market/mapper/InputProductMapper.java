package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.inputProduct.InputProductCreateDto;
import uz.pdp.market.dto.inputProduct.InputProductDto;
import uz.pdp.market.dto.inputProduct.InputProductUpdateDto;
import uz.pdp.market.entity.market.InputProduct;
import uz.pdp.market.mapper.BaseMapper;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface InputProductMapper extends BaseMapper<
        InputProduct,
        InputProductDto,
        InputProductCreateDto,
        InputProductUpdateDto> {
    @Override
    InputProductDto toDto(InputProduct inputProduct);

    @Override
    List<InputProductDto> toDto(List<InputProduct> e);

    @Override
    InputProduct fromCreateDto(InputProductCreateDto inputProductCreateDto);

    @Override
    InputProduct fromUpdateDto(InputProductUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    InputProduct fromUpdateDto(InputProductUpdateDto d, @MappingTarget InputProduct inputProduct);
}
