package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.OutputProduct;
import uz.pdp.market.entity.organization.Organization;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface OutputProductRepository extends JpaRepository<OutputProduct, Long>, AbstractRepository {

    Optional<OutputProduct> findByIdAndDeletedFalse(@NotNull Long id);

    List<OutputProduct> findAllByDeletedFalse();

}
