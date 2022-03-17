package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "input_product", schema = "market")
public class OutputProduct extends Auditable {

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Double amount;

    private Double price;

    private LocalDateTime expiry_date;

    @ManyToOne
    private OutCome outCome;
}
