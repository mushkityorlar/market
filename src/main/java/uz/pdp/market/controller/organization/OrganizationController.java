package uz.pdp.market.controller.organization;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.market.controller.AbstractController;
import uz.pdp.market.dto.organization.OrganizationCreateDto;
import uz.pdp.market.dto.organization.OrganizationDto;
import uz.pdp.market.dto.organization.OrganizationUpdateDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.service.organization.OrganizationService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrganizationController extends AbstractController<OrganizationService> {

    public OrganizationController(OrganizationService service) {
        super(service);
    }

    @PostMapping(value = PATH + "/organization")
    public ResponseEntity<DataDto<Long>> create(@Valid @RequestBody OrganizationCreateDto createDto) {
        return service.create(createDto);
    }

    @PutMapping(value = PATH + "/organization")
    public ResponseEntity<DataDto<Boolean>> update(@Valid @RequestBody OrganizationUpdateDto updateDto) {
        return service.update(updateDto);
    }

    @DeleteMapping(value = PATH + "/organization/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping(value = PATH + "/organization/{id}")
    public ResponseEntity<DataDto<OrganizationDto>> get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping(value = PATH + "/organization")
    public ResponseEntity<DataDto<List<OrganizationDto>>> getAll() {
        return service.getAll();
    }
}
