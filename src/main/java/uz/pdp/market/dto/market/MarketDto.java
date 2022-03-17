package uz.pdp.market.dto.market;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MarketDto extends GenericDto {
    private String name;
    private boolean active;


    @Builder(builderMethodName = "childBuilder")
    public MarketDto(Long id, String name, boolean active) {
        super(id);
        this.name = name;
        this.active = active;
    }
}
