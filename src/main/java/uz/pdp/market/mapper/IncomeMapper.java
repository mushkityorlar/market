package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.income.IncomeCreateDto;
import uz.pdp.market.dto.income.IncomeDto;
import uz.pdp.market.dto.income.IncomeUpdateDto;
import uz.pdp.market.entity.market.Income;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface IncomeMapper extends BaseMapper<
        Income,
        IncomeDto,
        IncomeCreateDto,
        IncomeUpdateDto> {
    @Override
    IncomeDto toDto(Income income);

    @Override
    List<IncomeDto> toDto(List<Income> e);

    @Override
    Income fromCreateDto(IncomeCreateDto incomeCreateDto);

    @Override
    Income fromUpdateDto(IncomeUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Income fromUpdateDto(IncomeUpdateDto d, @MappingTarget Income income);

}
