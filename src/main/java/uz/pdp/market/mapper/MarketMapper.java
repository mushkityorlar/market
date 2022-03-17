package uz.pdp.market.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.market.MarketCreateDto;
import uz.pdp.market.dto.market.MarketDto;
import uz.pdp.market.dto.market.MarketUpdateDto;
import uz.pdp.market.entity.market.Market;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface MarketMapper extends BaseMapper<
        Market,
        MarketDto,
        MarketCreateDto,
        MarketUpdateDto> {
    @Override
    MarketDto toDto(Market market);

    @Override
    List<MarketDto> toDto(List<Market> e);

    @Override
    Market fromCreateDto(MarketCreateDto marketCreateDto);

    @Override
    Market fromUpdateDto(MarketUpdateDto d);
}
