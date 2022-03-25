package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.market.MarketCreateDto;
import uz.pdp.market.dto.market.MarketDto;
import uz.pdp.market.dto.market.MarketUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.market.MarketService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MarketController extends AbstractController<MarketService> {

    public MarketController(MarketService service) {
        super(service);
    }
    @RequestMapping(value = PATH + "/market", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody MarketCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/market", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<MarketDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/market/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<MarketDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/market", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody MarketUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/market/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
