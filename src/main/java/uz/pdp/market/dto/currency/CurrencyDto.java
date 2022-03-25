package uz.pdp.market.dto.currency;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
public class CurrencyDto extends GenericDto {
    private String name;
    private boolean active;

    @Builder
    public CurrencyDto(Long id, String name, boolean active) {
        super(id);
        this.active = active;
        this.name = name;
    }
}
