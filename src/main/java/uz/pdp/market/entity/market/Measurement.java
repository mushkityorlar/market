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
@Table(name = "measurement", schema = "market")
public class Measurement extends Auditable {
    private String name;
    private boolean active;
}
