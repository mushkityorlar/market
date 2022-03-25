package uz.pdp.market.dto.product;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto extends GenericDto {
    private String name;

    private String imgPath;

    private String code;

    private String inCome;

    private String outCome;


    @Builder(builderMethodName = "childBuilder")
    public ProductDto(Long id, String name, String imgPath, String code, String inCome, String outCome) {
        super(id);
        this.name = name;
        this.imgPath = imgPath;
        this.code = code;
        this.inCome = inCome;
        this.outCome = outCome;
    }
}
