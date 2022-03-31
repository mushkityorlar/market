package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.*;
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
    @JoinColumn(name = "product_id" , referencedColumnName = "id")
    private Product product;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "measurement_id" , referencedColumnName = "id")
    private Measurement measurement;

    private Double incomePrice;

    private Double outcomePrice;

    private Date expireDate;

    @ManyToOne
    @JoinColumn(name = "currency_id" , referencedColumnName = "id")
    private Currency currency;


}
