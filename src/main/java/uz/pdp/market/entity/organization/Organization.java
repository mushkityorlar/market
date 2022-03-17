package uz.pdp.market.entity.organization;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.enums.Status;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "organization", schema = "organization")
public class Organization extends Auditable {
    private String name;

    private String email;

    private String code;

    private String website;

    @Enumerated(EnumType.STRING)
    private Status status;
}



