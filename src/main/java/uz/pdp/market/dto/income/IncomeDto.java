package uz.pdp.market.dto.income;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class IncomeDto extends GenericDto {

    private String tittle;
    private String description;
    private int amount;
    private String currencyId;
    private LocalDateTime date;
    private String madeById;

    @Builder
    public IncomeDto(Long id, String tittle, String description, int amount, String currencyId, LocalDateTime date, String madeById) {
        super(id);
        this.tittle = tittle;
        this.description = description;
        this.amount = amount;
        this.currencyId = currencyId;
        this.date = date;
        this.madeById = madeById;
    }
}
