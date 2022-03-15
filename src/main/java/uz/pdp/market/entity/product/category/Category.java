package uz.pdp.market.entity.product.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category extends Auditable {

    private String name;

    private boolean active;

}
