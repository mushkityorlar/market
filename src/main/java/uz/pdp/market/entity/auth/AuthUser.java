package uz.pdp.market.entity.auth;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import uz.pdp.market.dto.base.GenericDto;
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

    @Builder(builderMethodName = "childBuilder")
    public AuthUser(Long id, String userName, String password, String fullName, String phone, AuthRole role) {
        super(id);
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.name();
    }
}