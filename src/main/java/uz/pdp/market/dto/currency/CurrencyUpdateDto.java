package uz.pdp.market.dto.currency;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
public class CurrencyUpdateDto extends GenericDto {
    private String name;

    @Builder
    public CurrencyUpdateDto(Long id, String name) {
        super(id);
        this.name = name;
    }
}
