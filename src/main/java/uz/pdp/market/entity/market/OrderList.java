package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.auth.AuthUser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "order_list", schema = "market")
public class OrderList extends Auditable implements BaseEntity {

    @ManyToOne
    private Category category;

    private String name;

    private String description;

    @Column(nullable = false)
    private int amount;

    private int inAdvance;

    @ManyToOne
    private Currency currency;

    private LocalDateTime registeredDate;

    private LocalDateTime completeDate;

    private String clientPhone;

    @ManyToOne
    private AuthUser madeBy;
}
