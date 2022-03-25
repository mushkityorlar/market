package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Currency;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface CurrencyRepository extends JpaRepository<Currency, Long>, AbstractRepository {
    Optional<Currency> findByIdAndDeletedFalse(@NotNull Long id);

    List<Currency> findAllByDeletedFalse();
}
