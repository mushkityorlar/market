package uz.pdp.market.dto.orderList;

import lombok.Builder;
import uz.pdp.market.dto.base.GenericDto;

import java.time.LocalDateTime;

public class OrderListUpdateDto extends GenericDto {

    private final String categoryId;

    private final String name;

    private final String description;

    private final double amount;

    private final int inAdvance;

    private final String currencyId;

    private final LocalDateTime registeredDate;

    private final LocalDateTime completeDate;

    private final String clientPhone;

    private final String madeById;

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
