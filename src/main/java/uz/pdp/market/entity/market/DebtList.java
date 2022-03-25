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
@Table(name = "debt_list", schema = "market")
public class DebtList extends Auditable implements BaseEntity {
    @ManyToOne
    private AuthUser lender;

    @ManyToOne
    private AuthUser borrower;

    private String description;

    @Column(nullable = false)
    private int amount;

    @ManyToOne
    private Currency currency;

    private LocalDateTime getDate;

    private LocalDateTime replyDate;

}
