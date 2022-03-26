package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long>, AbstractRepository {

    Optional<Income> findByIdAndDeletedFalse(Long id);

    List<Income> findAllByDeletedFalse();
}
