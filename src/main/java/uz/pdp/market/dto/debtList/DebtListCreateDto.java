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

    private int amount;

    private String currencyId;

    private LocalDateTime getDate;

    private LocalDateTime replyDate;

    @Builder

    public DebtListCreateDto(String lenderId, String borrowerId, String description, int amount, String currencyId, LocalDateTime getDate, LocalDateTime replyDate) {
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.getDate = getDate;
        this.replyDate = replyDate;
    }
}
