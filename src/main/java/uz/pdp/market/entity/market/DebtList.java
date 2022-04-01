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
    @JoinColumn(name = "lender_id" , referencedColumnName = "id")
    private AuthUser lender;

    @ManyToOne
    @JoinColumn(name = "borrow_id" , referencedColumnName = "id")
    private AuthUser borrower;

    @Column(length = 50)
    private String description;

    private double amount;

    private double price;

    @ManyToOne
    @JoinColumn(name = "currency_id" , referencedColumnName = "id")
    private Currency currency;

    private LocalDateTime getDate;

    private LocalDateTime returnDate;

}
