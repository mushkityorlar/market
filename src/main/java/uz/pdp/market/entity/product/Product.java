package uz.pdp.market.entity.product;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product extends Auditable {

    private String name;

    private String imgPath;

    private String categoryId;

    private String code;

    @ManyToOne
    private Measurement measurementId;

    private BigDecimal inCome;

    private BigDecimal outCome;

}
