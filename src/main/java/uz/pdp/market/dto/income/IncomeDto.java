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
    private double amount;
    private Long measurementId;
    private Double price;
    private Long currencyId;
    private LocalDateTime date;

    @Builder
    public IncomeDto(Long id, String tittle, String description, double amount, Long measurementId, Double price, Long currencyId, LocalDateTime date/* String madeById*/) {
        super(id);
        this.tittle = tittle;
        this.description = description;
        this.amount = amount;
        this.measurementId = measurementId;
        this.price = price;
        this.currencyId = currencyId;
        this.date = date;
//        this.madeById = madeById;
    }
}
