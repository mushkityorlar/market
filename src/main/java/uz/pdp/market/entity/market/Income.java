package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "income", schema = "market")
public class Income extends Auditable {
    private Timestamp date;

    @ManyToOne
    private Currency currency;

    private String code;
}
