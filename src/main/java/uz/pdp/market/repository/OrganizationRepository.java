package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Category;
import uz.pdp.market.entity.organization.Organization;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {

    Optional<Organization> findByIdAndDeletedFalse(@NotNull Long id);

    List<Organization> findAllByDeletedFalse();

}
