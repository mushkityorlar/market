package uz.pdp.market.dto.debtList;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DebtListUpdateDto extends GenericDto {

    private String name;

    private String lenderId;

    private String borrowerName;

    private String borrowerPhone;

    private String description;

    private double amount;

    private String measurementId;

    private String currencyId;

    private LocalDateTime getDate;

    private LocalDateTime returnDate;

}
