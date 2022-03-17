package uz.pdp.market.dto.market;

import lombok.Builder;
import uz.pdp.market.dto.base.GenericDto;

public class MarketUpdateDto extends GenericDto {
    private String name;

    private boolean active;

    @Builder(builderMethodName = "childBuilder")
    public MarketUpdateDto(Long id, String name, boolean active) {
        super(id);
        this.name = name;
        this.active = active;
    }
}
