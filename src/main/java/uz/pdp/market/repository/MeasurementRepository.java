package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.Measurement;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface MeasurementRepository extends JpaRepository<Measurement, Long>, AbstractRepository {

    Optional<Measurement> findByIdAndDeletedFalse(@NotNull Long id);

    List<Measurement> findAllByDeletedFalse();
}
