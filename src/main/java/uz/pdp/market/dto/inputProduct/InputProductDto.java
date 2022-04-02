package uz.pdp.market.dto.inputProduct;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.market.Product;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InputProductDto extends GenericDto {

    private Product product;

    private double amount;

    private long measurementId;

    private Double incomePrice;

    private Double outcomePrice;

    private Date expireDate;

    private long currencyId;

    private long marketId;
}
