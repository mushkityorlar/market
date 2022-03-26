package uz.pdp.market.dto.orderList;

import lombok.Builder;
import uz.pdp.market.dto.base.Dto;

import java.time.LocalDateTime;

public class OrderListCreateDto implements Dto {
    private String categoryId;

    private String name;

    private String description;

    private int amount;

    private int inAdvance;

    private String currencyId;

    private LocalDateTime registeredDate;

    private LocalDateTime completeDate;

    private String clientPhone;

    private String madeById;

    @Builder()

    public OrderListCreateDto(String categoryId, String name, String description, int amount, int inAdvance, String currencyId, LocalDateTime registeredDate, LocalDateTime completeDate, String clientPhone, String madeById) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.inAdvance = inAdvance;
        this.currencyId = currencyId;
        this.registeredDate = registeredDate;
        this.completeDate = completeDate;
        this.clientPhone = clientPhone;
        this.madeById = madeById;
    }
}
