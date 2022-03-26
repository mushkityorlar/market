package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.debtList.DebtListCreateDto;
import uz.pdp.market.dto.debtList.DebtListDto;
import uz.pdp.market.dto.debtList.DebtListUpdateDto;
import uz.pdp.market.entity.market.DebtList;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface DebtListMapper extends BaseMapper<
        DebtList,
        DebtListDto,
        DebtListCreateDto,
        DebtListUpdateDto> {
    @Override
    DebtListDto toDto(DebtList debtList);

    @Override
    List<DebtListDto> toDto(List<DebtList> e);

    @Override
    DebtList fromCreateDto(DebtListCreateDto debtListCreateDto);

    @Override
    DebtList fromUpdateDto(DebtListUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DebtList fromUpdateDto(DebtListUpdateDto d, @MappingTarget DebtList debtList);
}
