package uz.pdp.market.dto.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@AllArgsConstructor
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