package uz.pdp.market.dto.auth;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthUserCreateDto {

    private String userName;
    private String password;
    private String fullName;
    private String phone;
    private String role;
    private String marketId;
    private String organizationId;
    private String chatId;
    private String state;

}
