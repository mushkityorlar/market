package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.auth.AuthUser;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "output_product", schema = "market")
public class OutputProduct extends Auditable {

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Double amount;

    private Double price;

    private Double discountedPrice;

    @ManyToOne
    private AuthUser selledBy;

    @ManyToOne
    private Currency currency;

    @OneToOne
    private InputProduct inputProduct;

    private LocalDateTime expiry_date;
}
