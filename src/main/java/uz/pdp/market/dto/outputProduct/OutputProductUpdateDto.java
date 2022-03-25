package uz.pdp.market.dto.outputProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OutputProductUpdateDto extends GenericDto {
    private Double amount;
    private Double price;
    private Double discountedPrice;
    //    private String soldBy;
    private String currencyId;
    private String inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductUpdateDto(Long id, Double amount, Double price, Double discountedPrice, String currencyId, String inputProductId, LocalDateTime expiry_date) {
        super(id);
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
//        this.soldBy = soldBy;
        this.currencyId = currencyId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
