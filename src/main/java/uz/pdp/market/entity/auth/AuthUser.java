package uz.pdp.market.entity.auth;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.market.Market;
import uz.pdp.market.entity.organization.Organization;
import uz.pdp.market.enums.AuthRole;

import javax.persistence.*;
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
public class AuthUser extends GenericDto implements GrantedAuthority {
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

    @Builder(builderMethodName = "childBuilder")
    public AuthUser(Long id, String userName, String password, String fullName, String phone, AuthRole role, Market market, Organization organization) {
        super(id);
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