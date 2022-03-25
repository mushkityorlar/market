package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.inputProduct.InputProductCreateDto;
import uz.pdp.market.dto.inputProduct.InputProductDto;
import uz.pdp.market.dto.inputProduct.InputProductUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.inputProduct.InputProductService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InputProductController extends AbstractController<InputProductService> {

    public InputProductController(InputProductService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/inputProduct", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody InputProductCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/inputProduct", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<InputProductDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/inputProduct/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<InputProductDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/inputProduct", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody InputProductUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/inputProduct/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
