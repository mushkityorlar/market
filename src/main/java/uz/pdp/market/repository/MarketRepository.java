package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Market;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface MarketRepository extends JpaRepository<Market, Long> {

    Optional<Market> findByIdAndDeletedFalse(@NotNull Long id);

    List<Market> findAllByDeletedFalse();
}
