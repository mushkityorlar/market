package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "currency", schema = "market")
public class Currency extends Auditable {
    private String name;
    private boolean active;


}
