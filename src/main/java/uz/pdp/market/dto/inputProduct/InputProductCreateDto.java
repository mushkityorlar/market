package uz.pdp.market.dto.inputProduct;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;
import uz.pdp.market.entity.market.Measurement;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class InputProductCreateDto implements Dto {
    @Schema(required = true)
    private String productId;

    private Integer amount;

    private Measurement measurement;

    private Double incomePrice;

    private Double outcomePrice;

    private Date expireDate;

    private String currencyId;

    @Builder()

    public InputProductCreateDto(String productId, Integer amount, Measurement measurement, Double incomePrice, Double outcomePrice, Date expireDate, String currencyId) {
        this.productId = productId;
        this.amount = amount;
        this.measurement = measurement;
        this.incomePrice = incomePrice;
        this.outcomePrice = outcomePrice;
        this.expireDate = expireDate;
        this.currencyId = currencyId;
    }
}
