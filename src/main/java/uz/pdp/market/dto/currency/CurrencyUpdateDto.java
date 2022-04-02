package uz.pdp.market.dto.currency;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyUpdateDto extends GenericDto {

    private String name;

    private boolean active;
}
