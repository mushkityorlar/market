package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.orderList.OrderListCreateDto;
import uz.pdp.market.dto.orderList.OrderListDto;
import uz.pdp.market.dto.orderList.OrderListUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.orderList.OrderListService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrderListController extends AbstractController<OrderListService> {

    public OrderListController(OrderListService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/orderList", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody OrderListCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/orderList", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<OrderListDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/orderList/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<OrderListDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/orderList", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody OrderListUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/orderList/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
