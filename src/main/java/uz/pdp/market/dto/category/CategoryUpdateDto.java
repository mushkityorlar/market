package uz.pdp.market.dto.category;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryUpdateDto extends GenericDto {

    private String name;

    private boolean active;
}
