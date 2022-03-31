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
    private double amount;
    private Double price;
    private Double discountedPrice;
    private Long currencyId;
    private Long measurementId;
    private Long inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductUpdateDto(Long id, double amount, Double price, Double discountedPrice, Long currencyId, Long measurementId, Long inputProductId, LocalDateTime expiry_date) {
        super(id);
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.currencyId = currencyId;
        this.measurementId = measurementId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
