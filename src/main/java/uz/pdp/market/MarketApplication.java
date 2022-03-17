package uz.pdp.market;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.pdp.market.entity.auth.AuthUser;
import uz.pdp.market.enums.AuthRole;
import uz.pdp.market.properties.OpenApiProperties;
import uz.pdp.market.properties.ServerProperties;
import uz.pdp.market.repository.AuthUserRepository;

@EnableConfigurationProperties({
        OpenApiProperties.class,
        ServerProperties.class
})
@OpenAPIDefinition
@SpringBootApplication
@RequiredArgsConstructor
public class MarketApplication {

    private final AuthUserRepository authUserRepository;
    private final PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(MarketApplication.class, args);
    }

//    @Bean
    CommandLineRunner runner() {
        return (args) -> {
            authUserRepository.deleteAll();
            String encode = passwordEncoder.encode("123");
            System.out.println("encode = " + encode);

            AuthUser admin = AuthUser.childBuilder()
                    .userName("admin")
                    .password(encode)
                    .fullName("Abdukarimov Nodirbek")
                    .phone("+998943123858")
                    .role(AuthRole.ADMIN)
                    .build();
            authUserRepository.save(admin);
        };
    }
}
