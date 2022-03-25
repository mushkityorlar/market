package uz.pdp.market.entity.auth;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.market.Market;
import uz.pdp.market.entity.organization.Organization;
import uz.pdp.market.enums.AuthRole;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "auth_user", indexes = {
        @Index(name = "auth_user_username_key",
                columnList = "username", unique = true
        )
}, schema = "auth")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthUser extends Auditable implements BaseEntity,GrantedAuthority {
    @Column(name = "username", nullable = false, length = 50)
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "phone")
    private String phone;

    @Enumerated(EnumType.STRING)
    private AuthRole role;

    @ManyToOne
    private Market market;

    @ManyToOne
    private Organization organization;
    public AuthUser(Long id, Long createdBy, Long updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt, boolean deleted, String userName, String password, String fullName, String phone, AuthRole role, Market market, Organization organization) {
        super(id, createdBy, updatedBy, createdAt, updatedAt, deleted);
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.role = role;
        this.market = market;
        this.organization = organization;
    }


    @Override
    public String getAuthority() {
        return role.name();
    }
}