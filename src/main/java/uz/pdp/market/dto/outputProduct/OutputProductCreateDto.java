package uz.pdp.market.dto.outputProduct;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.auth.AuthUser;
import uz.pdp.market.entity.market.Currency;
import uz.pdp.market.entity.market.InputProduct;
import uz.pdp.market.entity.market.Product;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OutputProductCreateDto implements Dto {
    private Double amount;
    private Double price;
    private Double discountedPrice;
    private Long soldById;
    private Long currencyId;
    private Long inputProductId;
    private LocalDateTime expiry_date;

    @Builder
    public OutputProductCreateDto(Double amount, Double price, Double discountedPrice, Long soldBy, Long currencyId, Long inputProductId, LocalDateTime expiry_date) {
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.soldById = soldBy;
        this.currencyId = currencyId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
