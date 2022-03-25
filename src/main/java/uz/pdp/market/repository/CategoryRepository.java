package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Category;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long>, AbstractRepository {
    Optional<Category> findByIdAndDeletedFalse(@NotNull Long id);

    List<Category> findAllByDeletedFalse();
}
