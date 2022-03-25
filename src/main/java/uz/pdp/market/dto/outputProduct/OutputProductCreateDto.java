package uz.pdp.market.dto.outputProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OutputProductCreateDto implements Dto {
    private Double amount;
    private Double price;
    private Double discountedPrice;
    //    private String soldById;
    private String currencyId;
    private String inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductCreateDto(Double amount, Double price, Double discountedPrice, String currencyId, String inputProductId, LocalDateTime expiry_date) {
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
//        this.soldById = soldById;
        this.currencyId = currencyId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
