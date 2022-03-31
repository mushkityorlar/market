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
    private double amount;
    private Double price;
    private Double discountedPrice;
    private Long currencyId;
    private Long measurementId;
    private Long inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductCreateDto(double amount, Double price, Double discountedPrice, Long measurementId, Long currencyId, Long inputProductId, LocalDateTime expiry_date) {
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.currencyId = currencyId;
        this.measurementId = measurementId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
