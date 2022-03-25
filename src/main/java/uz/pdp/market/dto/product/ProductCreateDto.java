package uz.pdp.market.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

@Getter
@Setter
@NoArgsConstructor
public class ProductCreateDto implements Dto {
    private String name;

    private String imgPath;

    @Builder()
    public ProductCreateDto(String name, String imgPath) {
        this.name = name;
        this.imgPath = imgPath;
    }
}
