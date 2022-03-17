package uz.pdp.market.dto.market;

import lombok.Builder;
import uz.pdp.market.dto.base.Dto;

public class MarketCreateDto implements Dto {
    private String name;

    @Builder()
    public MarketCreateDto(String name) {
        this.name = name;
    }

}
