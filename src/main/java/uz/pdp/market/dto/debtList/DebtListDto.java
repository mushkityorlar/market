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

    private double amount;

    private String currencyId;

    private LocalDateTime getDate;

    private LocalDateTime returnDate;

    @Builder
    public DebtListDto(Long id, String lenderId, String borrowerId, String description, double amount, String currencyId, LocalDateTime getDate, LocalDateTime returnDate) {
        super(id);
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.getDate = getDate;
        this.returnDate = returnDate;
    }
}
