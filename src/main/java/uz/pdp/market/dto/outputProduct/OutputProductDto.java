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
public class OutputProductDto extends GenericDto {
    private Double amount;
    private Double price;
    private Double discountedPrice;
    //    private String soldById;
    private String currencyId;
    private String inputProductId;
    private LocalDateTime expiry_date;

    @Builder

    public OutputProductDto(Long id, Double amount, Double price, Double discountedPrice, String currencyId, String inputProductId, LocalDateTime expiry_date) {
        super(id);
        this.amount = amount;
        this.price = price;
        this.discountedPrice = discountedPrice;
//        this.soldById = soldById;
        this.currencyId = currencyId;
        this.inputProductId = inputProductId;
        this.expiry_date = expiry_date;
    }
}
