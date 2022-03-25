package uz.pdp.market.dto.product;

import lombok.Builder;
import uz.pdp.market.dto.base.Dto;

public class ProductCreateDto implements Dto {
    private String name;

    private String imgPath;

    private String code;

    private String inCome;

    private String outCome;


    @Builder()

    public ProductCreateDto(String name, String imgPath, String code, String inCome, String outCome) {
        this.name = name;
        this.imgPath = imgPath;
        this.code = code;
        this.inCome = inCome;
        this.outCome = outCome;
    }


}
