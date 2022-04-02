package uz.pdp.market.dto.product;

import lombok.Builder;
import uz.pdp.market.dto.base.Dto;

public class ProductCreateDto implements Dto {
    private final String name;

    private final String imgPath;

    private final String code;

    private final String inCome;

    private final String outCome;


    @Builder()

    public ProductCreateDto(String name, String imgPath, String code, String inCome, String outCome) {
        this.name = name;
        this.imgPath = imgPath;
        this.code = code;
        this.inCome = inCome;
        this.outCome = outCome;
    }


}
