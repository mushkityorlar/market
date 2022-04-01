package uz.pdp.market.entity.market;

import lombok.*;
import org.springframework.stereotype.Component;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Husanov Asliddin Fri,11:06,01/04/22
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "market", schema = "market")
public class MarketType extends Auditable {

    private String name;

    private String description;
}
