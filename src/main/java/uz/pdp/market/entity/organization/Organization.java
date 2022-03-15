package uz.pdp.market.entity.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.enums.Status;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Organization extends Auditable {

    private String name;

    private String email;

    private String code;

    private String website;

    @Enumerated(EnumType.STRING)
    private Status status;
}



