package uz.pdp.market.service;

import org.springframework.http.ResponseEntity;
import uz.pdp.market.criteria.GenericCriteria;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.dto.response.DataDto;

import java.io.Serializable;
import java.util.List;


/**
 * @param <D> -> Dto
 * @param <K> -> class that defines the primary key for your pojo class
 * @param <C> -> Criteria (For Filtering Request)
 */
public interface GenericService<
        D extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable> extends BaseService {

    ResponseEntity<DataDto<List<D>>> getAll();

    default ResponseEntity<DataDto<List<D>>> getAll(C c) {
        return null;
    }

    ResponseEntity<DataDto<D>> get(K id);

    Long totalCount(C criteria);
}