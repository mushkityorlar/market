package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.debtList.DebtListCreateDto;
import uz.pdp.market.dto.debtList.DebtListDto;
import uz.pdp.market.dto.debtList.DebtListUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.debtList.DebtListService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DebtListController extends AbstractController<DebtListService> {

    public DebtListController(DebtListService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/debtList", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody DebtListCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/debtList", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<DebtListDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/debtList/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<DebtListDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/debtList", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody DebtListUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/debtList/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
