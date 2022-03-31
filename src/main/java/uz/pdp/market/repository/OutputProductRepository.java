package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.pdp.market.entity.market.OutputProduct;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;


@Repository


public interface OutputProductRepository extends JpaRepository<OutputProduct, Long>, AbstractRepository {

    @Modifying
    @Transactional
    @Query(
            value =
                    "insert into market.income ( amount, measurement_id,price,description,tittle,currency_id) " +
                            "values (:amount,:measurement_id,:price * :amount,'aaa','bbb',:currency_id)",
            nativeQuery = true)
    void insertToIncome(
            @Param("amount") Double amount,
            @Param("measurement_id") Long measurementId,
            @Param("price") Double price,
            @Param("currency_id") Long currencyId
            /*   @Param("product_name") String product_name*/
    );

    Optional<OutputProduct> findByIdAndDeletedFalse(@NotNull Long id);

    List<OutputProduct> findAllByDeletedFalse();

}
