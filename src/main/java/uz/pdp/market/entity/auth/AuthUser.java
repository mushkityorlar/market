package uz.pdp.market.entity.auth;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.entity.market.Market;
import uz.pdp.market.entity.organization.Organization;
import uz.pdp.market.enums.AuthRole;

import javax.persistence.*;

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

    private String chatId;

    private String state;

    @Override
    public String getAuthority() {
        return role.name();
    }
}