package uz.pdp.market.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.dto.income.IncomeCreateDto;
import uz.pdp.market.dto.income.IncomeDto;
import uz.pdp.market.dto.income.IncomeUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.income.IncomeService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class IncomeController extends AbstractController<IncomeService> {

    public IncomeController(IncomeService service) {
        super(service);
    }

    @PostMapping(value = PATH+"/income")
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody IncomeCreateDto createDto){
        return service.create(createDto);
    }

    @PutMapping(value = PATH+"/income")
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody IncomeUpdateDto updateDto){
        return service.update(updateDto);
    }

    @DeleteMapping(value = PATH+"/income/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id){
        return service.delete(id);
    }

    @GetMapping(value = PATH+"/income/{id}")
    public ResponseEntity<DataDto<IncomeDto>> get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping(value = PATH+"/income")
    public ResponseEntity<DataDto<List<IncomeDto>>> getAll(){
        return service.getAll();
    }
}
