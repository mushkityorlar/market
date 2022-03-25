package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "input_product", schema = "market")
public class InputProduct extends Auditable implements BaseEntity {

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    private Measurement measurement;

    private Double incomePrice;

    private Double outcomePrice;

    private Date expireDate;

    @ManyToOne
    private Currency currency;


}
