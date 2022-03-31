package uz.pdp.market.dto.orderList;

import lombok.Builder;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

public class OrderListUpdateDto extends GenericDto {

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

    @Builder(builderMethodName = "childBuilder")

    public OrderListUpdateDto(Long id, String categoryId, String name, String description, double amount, int inAdvance, String currencyId, LocalDateTime registeredDate, LocalDateTime completeDate, String clientPhone, String madeById) {
        super(id);
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
