package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Product;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByIdAndDeletedFalse(@NotNull Long id);

    List<Product> findAllByDeletedFalse();
}
