package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.organization.Organization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    private boolean active;

    @ManyToOne
    private Organization organization;
}