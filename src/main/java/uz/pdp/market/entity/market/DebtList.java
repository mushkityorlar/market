package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.auth.AuthUser;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "debt_list", schema = "market")
public class DebtList extends Auditable implements BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "lender_id", referencedColumnName = "id")
    private AuthUser lender;

    private String borrowerName;

    private String borrowerPhone;

    @Column(length = 50)
    private String description;

    private double amount;

    @OneToOne
    @JoinColumn(name = "measurement_id",referencedColumnName = "id")
    private Measurement measurement;

    private double price;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    private LocalDateTime getDate;

    private LocalDateTime returnDate;

}
