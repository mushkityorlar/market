package uz.pdp.market.dto.orderList;

import lombok.*;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderListCreateDto implements Dto {
    private String categoryId;

    private String name;

    private String description;

    private double amount;

    private int inAdvance;

    private String currencyId;

    private LocalDateTime registeredDate;

    private LocalDateTime completeDate;

    private String clientPhone;

    private String madeById;
}
