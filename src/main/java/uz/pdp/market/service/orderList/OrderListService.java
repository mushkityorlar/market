package uz.pdp.market.service.orderList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.market.criteria.GenericCriteria;
import uz.pdp.market.dto.orderList.OrderListCreateDto;
import uz.pdp.market.dto.orderList.OrderListDto;
import uz.pdp.market.dto.orderList.OrderListUpdateDto;
import uz.pdp.market.dto.response.AppErrorDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.entity.market.OrderList;
import uz.pdp.market.mapper.OrderListMapper;
import uz.pdp.market.repository.OrderListRepository;
import uz.pdp.market.service.AbstractService;
import uz.pdp.market.service.GenericCrudService;
import uz.pdp.market.utils.validator.orderList.OrderListValidator;

import java.util.List;
import java.util.Optional;

@Service
public class OrderListService extends AbstractService<OrderListRepository, OrderListMapper, OrderListValidator> implements GenericCrudService<OrderList, OrderListDto, OrderListCreateDto, OrderListUpdateDto, GenericCriteria, Long> {

    protected OrderListService(OrderListRepository repository, OrderListMapper mapper, OrderListValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(OrderListCreateDto createDto) {
        OrderList orderList = mapper.fromCreateDto(createDto);
        repository.save(orderList);
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        Optional<OrderList> optionalOrderList = repository.findByIdAndDeletedFalse(id);
        if (optionalOrderList.isEmpty()) {
            return new ResponseEntity<>(new DataDto<>(AppErrorDto
                    .builder()
                    .status(HttpStatus.NOT_FOUND)
                    .build()
            ), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> update(OrderListUpdateDto updateDto) {
        Optional<OrderList> orderListOptional = repository.findByIdAndDeletedFalse(updateDto.getId());
        if (orderListOptional.isEmpty()) {
            return new ResponseEntity<>(new DataDto<>(AppErrorDto
                    .builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message("OrderList not found by id : '%s'".formatted(updateDto.getId()))
                    .build()
            ), HttpStatus.CONFLICT);
        }
        OrderList orderList = mapper.fromUpdateDto(updateDto, orderListOptional.get());
        repository.save(orderList);
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<DataDto<List<OrderListDto>>> getAll() {
        List<OrderList> orderLists = repository.findAllByDeletedFalse();
        return new ResponseEntity<>(new DataDto<>(mapper.toDto(orderLists), (long) orderLists.size()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DataDto<OrderListDto>> get(Long id) {
        Optional<OrderList> orderListOptional = repository.findByIdAndDeletedFalse(id);
        if (orderListOptional.isEmpty())
            return new ResponseEntity<>(new DataDto<>(AppErrorDto.builder().build()), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(new DataDto<>(mapper.toDto(orderListOptional.get())), HttpStatus.OK);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
