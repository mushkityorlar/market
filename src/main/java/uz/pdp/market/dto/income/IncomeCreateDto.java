package uz.pdp.market.dto.income;

import lombok.*;
import uz.pdp.market.dto.base.Dto;
import uz.pdp.market.entity.market.Currency;
import uz.pdp.market.entity.market.Measurement;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IncomeCreateDto implements Dto {

    private String tittle;

    private String description;

    private double amount;

    private String measurementId;

    private Double price;

    private String currencyId;

    private LocalDateTime date;
}
