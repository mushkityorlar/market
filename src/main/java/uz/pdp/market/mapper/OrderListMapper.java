package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.orderList.OrderListCreateDto;
import uz.pdp.market.dto.orderList.OrderListDto;
import uz.pdp.market.dto.orderList.OrderListUpdateDto;
import uz.pdp.market.entity.market.OrderList;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface OrderListMapper extends BaseMapper<
        OrderList,
        OrderListDto,
        OrderListCreateDto,
        OrderListUpdateDto> {
    @Override
    OrderListDto toDto(OrderList orderList);

    @Override
    List<OrderListDto> toDto(List<OrderList> e);

    @Override
    OrderList fromCreateDto(OrderListCreateDto d);

    @Override
    OrderList fromUpdateDto(OrderListUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OrderList fromUpdateDto(OrderListUpdateDto d, @MappingTarget OrderList orderList);
}
