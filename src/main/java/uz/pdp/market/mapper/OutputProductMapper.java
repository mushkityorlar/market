package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.outputProduct.OutputProductCreateDto;
import uz.pdp.market.dto.outputProduct.OutputProductDto;
import uz.pdp.market.dto.outputProduct.OutputProductUpdateDto;
import uz.pdp.market.entity.market.OutputProduct;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface OutputProductMapper extends BaseMapper<
        OutputProduct,
        OutputProductDto,
        OutputProductCreateDto,
        OutputProductUpdateDto> {

    @Override
    OutputProductDto toDto(OutputProduct outputProduct);

    @Override
    List<OutputProductDto> toDto(List<OutputProduct> e);

    @Override
    OutputProduct fromCreateDto(OutputProductCreateDto outputProductCreateDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OutputProduct fromUpdateDto(OutputProductUpdateDto d, @MappingTarget OutputProduct outputProduct);
}
