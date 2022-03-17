package uz.pdp.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.auth.AuthUser;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long>,AbstractRepository {

    Optional<AuthUser> findAuthUserByUserName(String userName);

}
