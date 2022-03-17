package uz.pdp.market.entity.market;

import lombok.*;
import org.yaml.snakeyaml.error.Mark;
import uz.pdp.market.entity.Auditable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "outcome", schema = "market")
public class OutCome extends Auditable {
    private Date date;

    @ManyToOne
    private Currency currency;

    @Column(nullable = false, unique = true)
    private String code;

    private String factureNumber;

    @ManyToOne
    private Market market;
}
