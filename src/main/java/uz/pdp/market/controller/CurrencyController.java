package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.currency.CurrencyCreateDto;
import uz.pdp.market.dto.currency.CurrencyDto;
import uz.pdp.market.dto.currency.CurrencyUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.currency.CurrencyService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CurrencyController extends AbstractController<CurrencyService> {

    public CurrencyController(CurrencyService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/currency", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody CurrencyCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/currency", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<CurrencyDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/currency/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<CurrencyDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/currency", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody CurrencyUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/currency/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
