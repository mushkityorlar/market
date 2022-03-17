package uz.pdp.market.entity.market;


import lombok.*;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product", schema = "market")
public class Product extends Auditable {
    private String name;

    private String imgPath;

    private String code;

    private String inCome;

    private String outCome;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Measurement measurement;
}
