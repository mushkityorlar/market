package uz.pdp.market.entity.market;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "income", schema = "market")
public class Income extends Auditable {

    private Date date;

    @OneToMany
    private List<Currency> currency;

    private String code;
}
