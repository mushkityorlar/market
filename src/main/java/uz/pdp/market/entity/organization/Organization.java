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

    @Builder(builderMethodName = "childBuilder")
    public Organization(Long id, Long createdBy, Long updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt, boolean deleted, String name, String email, String code, String website, Status status) {
        super(id, createdBy, updatedBy, createdAt, updatedAt, deleted);
        this.name = name;
        this.email = email;
        this.code = code;
        this.website = website;
        this.status = status;
    }
}



