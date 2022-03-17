package uz.pdp.market.dto.category;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
public class CategoryUpdateDto extends GenericDto {

    private String name;

    @Builder
    public CategoryUpdateDto(Long id, String name) {
        super(id);
        this.name = name;
    }
}
