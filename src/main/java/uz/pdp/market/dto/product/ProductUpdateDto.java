package uz.pdp.market.dto.product;

import lombok.Builder;
import uz.pdp.market.dto.base.GenericDto;

public class ProductUpdateDto extends GenericDto {
    private String name;

    private String imgPath;

    private String code;

    private String inCome;

    private String outCome;

    @Builder(builderMethodName = "childBuilder")
    public ProductUpdateDto(Long id, String name, String imgPath, String code, String inCome, String outCome) {

        super(id);
        this.name = name;
        this.imgPath = imgPath;
        this.code = code;
        this.inCome = inCome;
        this.outCome = outCome;
    }
}
