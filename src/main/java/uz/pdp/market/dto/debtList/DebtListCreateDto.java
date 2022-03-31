package uz.pdp.market.dto.debtList;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DebtListCreateDto implements Dto {
    @Schema(required = true)

    private String lenderId;

    private String borrowerId;

    private String description;

    private double amount;

    private String currencyId;

    private LocalDateTime getDate;

    private LocalDateTime returnDate;

    @Builder

    public DebtListCreateDto(String lenderId, String borrowerId, String description, double amount, String currencyId, LocalDateTime getDate, LocalDateTime returnDate) {
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.getDate = getDate;
        this.returnDate = returnDate;
    }
}
