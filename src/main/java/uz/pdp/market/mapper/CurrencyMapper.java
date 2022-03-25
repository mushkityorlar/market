package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.currency.CurrencyCreateDto;
import uz.pdp.market.dto.currency.CurrencyDto;
import uz.pdp.market.dto.currency.CurrencyUpdateDto;
import uz.pdp.market.entity.market.Currency;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CurrencyMapper extends BaseMapper<
        Currency,
        CurrencyDto,
        CurrencyCreateDto,
        CurrencyUpdateDto> {
    @Override
    CurrencyDto toDto(Currency currency);

    @Override
    List<CurrencyDto> toDto(List<Currency> e);

    @Override
    Currency fromCreateDto(CurrencyCreateDto currencyCreateDto);

    @Override
    Currency fromUpdateDto(CurrencyUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Currency fromUpdateDto(CurrencyUpdateDto d, @MappingTarget Currency currency);
}
