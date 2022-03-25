package uz.pdp.market.dto.outputProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.auth.AuthUser;
import uz.pdp.market.entity.market.Currency;
import uz.pdp.market.entity.market.InputProduct;
import uz.pdp.market.entity.market.Product;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OutputProductDto extends GenericDto {
    private Double amount;
    private Double price;
    private Double discountedPrice;
    private Long soldBy;
    private Long currencyId;
    private Long inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductDto(Long id, Double amount, Double price, Double discountedPrice, Long soldBy, Long currencyId, Long inputProductId, LocalDateTime expiry_date) {
        super(id);
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.soldBy = soldBy;
        this.currencyId = currencyId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
