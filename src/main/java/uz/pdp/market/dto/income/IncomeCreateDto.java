package uz.pdp.market.dto.income;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class IncomeCreateDto implements Dto {

    private String tittle;
    private String description;
    private int amount;
    private String currencyId;
    private LocalDateTime date;
    private String madeById;

    @Builder
    public IncomeCreateDto(String tittle, String description, int amount, String currencyId, LocalDateTime date, String madeById) {
        this.tittle = tittle;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.date = date;
        this.madeById = madeById;
    }
}
