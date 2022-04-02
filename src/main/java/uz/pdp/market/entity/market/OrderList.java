package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.*;
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
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String description;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "measurement_id", referencedColumnName = "id")
    private Measurement measurement;

    private int inAdvance;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    private LocalDateTime registeredDate;

    private LocalDateTime completeDate;

    @Column(length = 20)
    private String clientPhone;

}
