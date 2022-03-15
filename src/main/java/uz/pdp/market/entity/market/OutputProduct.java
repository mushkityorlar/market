package uz.pdp.market.entity.market;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "input_product", schema = "market")
public class OutputProduct extends Auditable {

    @OneToOne
    private Product product;

    private Integer amount;

    private Double price;

    private LocalDateTime expiry_date;

    @OneToOne
    private OutCome outCome;
}
