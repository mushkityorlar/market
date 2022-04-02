package uz.pdp.market.entity.market;


import lombok.*;
import uz.pdp.market.entity.Auditable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product", schema = "market")
public class Product extends Auditable {
    @Column(length = 20)
    private String name;

    @Column(length = 50)
    private String imgPath;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

}
