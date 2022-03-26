package uz.pdp.market.dto.debtList;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DebtListDto extends GenericDto {

    private String lenderId;

    private String borrowerId;

    private String description;

    private int amount;

    private String currencyId;

    private LocalDateTime getDate;

    private LocalDateTime replyDate;

    @Builder
    public DebtListDto(Long id, String lenderId, String borrowerId, String description, int amount, String currencyId, LocalDateTime getDate, LocalDateTime replyDate) {
        super(id);
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.getDate = getDate;
        this.replyDate = replyDate;
    }
}
