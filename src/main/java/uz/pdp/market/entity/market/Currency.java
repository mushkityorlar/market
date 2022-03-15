package uz.pdp.market.entity.market;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "currency", schema = "market")
public class Currency extends Auditable {
    private String name;
    private boolean active;
}
