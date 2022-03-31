package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "currency", schema = "market")
public class Currency extends Auditable implements BaseEntity {
    @Column(length = 30)
    private String name;

    private boolean active;
}
