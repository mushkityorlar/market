package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.organization.Organization;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "market", schema = "market")
public class Market extends Auditable implements BaseEntity {
    @Column(length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "id")
    private MarketType type;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private Organization organization;
}