package uz.pdp.market.dto.debtList;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DebtListCreateDto implements Dto {

    private String name;

    @Schema(required = true)
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
