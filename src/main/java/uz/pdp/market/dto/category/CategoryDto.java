package uz.pdp.market.dto.category;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto extends GenericDto {
    private String name;
    private boolean active;

    @Builder(builderMethodName = "childBuilder")
    public CategoryDto(Long id, String name, boolean active) {
        super(id);
        this.active = active;
        this.name = name;
    }
}