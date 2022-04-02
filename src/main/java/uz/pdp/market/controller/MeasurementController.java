package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.measurement.MeasurementCreateDto;
import uz.pdp.market.dto.measurement.MeasurementDto;
import uz.pdp.market.dto.measurement.MeasurementUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.measurment.MeasurementService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MeasurementController extends AbstractController<MeasurementService> {

    public MeasurementController(MeasurementService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/measurement", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody MeasurementCreateDto dto) {
        return service.create(dto);
    }

    @RequestMapping(value = PATH + "/measurement", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<MeasurementDto>>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/measurement/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<MeasurementDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = PATH + "/measurement", method = RequestMethod.PUT)
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody MeasurementUpdateDto dto) {
        return service.update(dto);
    }

    @RequestMapping(value = PATH + "/measurement/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
