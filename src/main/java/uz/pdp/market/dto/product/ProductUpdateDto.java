package uz.pdp.market.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@NoArgsConstructor
public class ProductUpdateDto extends GenericDto {
    private String name;

    private String imgPath;


    @Builder
    public ProductUpdateDto(Long id, String name, String imgPath) {
        super(id);
        this.name = name;
        this.imgPath = imgPath;
    }
}
