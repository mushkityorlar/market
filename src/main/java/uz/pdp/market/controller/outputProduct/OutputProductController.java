package uz.pdp.market.controller.outputProduct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.controller.AbstractController;
import uz.pdp.market.dto.outputProduct.OutputProductCreateDto;
import uz.pdp.market.dto.outputProduct.OutputProductDto;
import uz.pdp.market.dto.outputProduct.OutputProductUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.outputProductService.OutputProductService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OutputProductController extends AbstractController<OutputProductService> {

    public OutputProductController(OutputProductService service) {
        super(service);
    }

    @PostMapping(value = PATH+"/outputProduct")
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody OutputProductCreateDto createDto){
        return service.create(createDto);
    }

    @PutMapping(value = PATH+"/outputProduct")
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody OutputProductUpdateDto updateDto){
        return service.update(updateDto);
    }

    @DeleteMapping(value = PATH+"/outputProduct/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id){
        return service.delete(id);
    }

    @GetMapping(value = PATH+"/outputProduct/{id}")
    public ResponseEntity<DataDto<OutputProductDto>> get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping(value = PATH+"/outputProduct")
    public ResponseEntity<DataDto<List<OutputProductDto>>> getAll(){
        return service.getAll();
    }
}
