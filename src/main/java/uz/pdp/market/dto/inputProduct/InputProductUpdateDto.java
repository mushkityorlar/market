package uz.pdp.market.dto.inputProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class InputProductUpdateDto extends GenericDto {

    private String productId;

    private Integer amount;

    private String measurementId;

    private Double incomePrice;

    private Double outcomePrice;

    private Date expireDate;

    private String currencyId;

    @Builder(builderMethodName = "childBuilder")
    public InputProductUpdateDto(Long id, String productId, Integer amount, String measurementId, Double incomePrice, Double outcomePrice, Date expireDate, String currencyId) {
        super(id);
        this.productId = productId;
        this.amount = amount;
        this.measurementId = measurementId;
        this.incomePrice = incomePrice;
        this.outcomePrice = outcomePrice;
        this.expireDate = expireDate;
        this.currencyId = currencyId;
    }
}
