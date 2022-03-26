package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.market.OrderList;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface OrderListRepository extends JpaRepository<OrderList, Long>, AbstractRepository {

    Optional<OrderList> findByIdAndDeletedFalse(@NotNull Long id);

    List<OrderList> findAllByDeletedFalse();
}
