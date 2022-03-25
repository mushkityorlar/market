package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.InputProduct;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface InputProductRepository extends JpaRepository<InputProduct, Long>, AbstractRepository {

    Optional<InputProduct> findByIdAndDeletedFalse(@NotNull Long id);

    List<InputProduct> findAllByDeletedFalse();
}
