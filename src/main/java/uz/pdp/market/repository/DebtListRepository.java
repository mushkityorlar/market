package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.DebtList;
import uz.pdp.market.entity.market.DebtList;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface DebtListRepository extends JpaRepository<DebtList, Long>, AbstractRepository {

    Optional<DebtList> findByIdAndDeletedFalse(@NotNull Long id);

    List<DebtList> findAllByDeletedFalse();
}
