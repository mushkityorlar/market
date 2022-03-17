package uz.pdp.market.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.product.ProductCreateDto;
import uz.pdp.market.dto.product.ProductDto;
import uz.pdp.market.dto.product.ProductUpdateDto;
import uz.pdp.market.entity.market.Product;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface ProductMapper extends BaseMapper<
        Product,
        ProductDto,
        ProductCreateDto,
        ProductUpdateDto> {
    @Override
    ProductDto toDto(Product market);

    @Override
    List<ProductDto> toDto(List<Product> e);

    @Override
    Product fromCreateDto(ProductCreateDto marketCreateDto);

    @Override
    Product fromUpdateDto(ProductUpdateDto d);
}
