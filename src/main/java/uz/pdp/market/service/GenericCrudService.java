package uz.pdp.market.service;

import org.springframework.http.ResponseEntity;
import uz.pdp.market.criteria.GenericCriteria;
import uz.pdp.market.dto.base.Dto;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.entity.BaseEntity;

import java.io.Serializable;

/**
 * @param <E>  -> Entity
 * @param <D>  -> Dto
 * @param <CD> -> Create Dto
 * @param <UD> -> Update Dto
 * @param <K>  -> class that defines the primary key for your pojo class
 * @param <C>  -> Criteria (For Filtering Request)
 */
public interface GenericCrudService<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable> extends GenericService<D, C, K> {

    ResponseEntity<DataDto<Long>> create(CD createDto);

    ResponseEntity<DataDto<Boolean>> delete(K id);

    ResponseEntity<DataDto<Boolean>> update(UD updateDto);
}
