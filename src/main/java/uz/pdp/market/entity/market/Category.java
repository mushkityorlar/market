package uz.pdp.market.entity.market;

import lombok.*;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import uz.pdp.market.entity.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "category", schema = "market")
public class Category extends Auditable {
    private String name;
    private boolean active;

}