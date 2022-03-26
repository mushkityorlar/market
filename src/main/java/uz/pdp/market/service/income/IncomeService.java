package uz.pdp.market.service.income;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.market.criteria.IncomeCriteria.IncomeCriteria;
import uz.pdp.market.dto.income.IncomeCreateDto;
import uz.pdp.market.dto.income.IncomeDto;
import uz.pdp.market.dto.income.IncomeUpdateDto;
import uz.pdp.market.dto.outputProduct.OutputProductDto;
import uz.pdp.market.dto.response.AppErrorDto;
import uz.pdp.market.dto.response.DataDto;
import uz.pdp.market.entity.market.Income;
import uz.pdp.market.entity.market.OutputProduct;
import uz.pdp.market.mapper.IncomeMapper;
import uz.pdp.market.repository.IncomeRepository;
import uz.pdp.market.service.AbstractService;
import uz.pdp.market.service.GenericCrudService;
import uz.pdp.market.utils.validator.income.IncomeValidator;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeService extends AbstractService<
        IncomeRepository,
        IncomeMapper,
        IncomeValidator> implements GenericCrudService<
        Income,
        IncomeDto,
        IncomeCreateDto,
        IncomeUpdateDto,
        IncomeCriteria,
        Long> {

    @Autowired
    protected IncomeService(IncomeRepository repository, IncomeMapper mapper, IncomeValidator validator) {
        super(repository, mapper, validator);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(IncomeCreateDto createDto) {
        Income income = mapper.fromCreateDto(createDto);
        repository.save(income);
        return new ResponseEntity<>(new DataDto<>(income.getId()), HttpStatus.CREATED);

    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        repository.delete(repository.getById(id));
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.NO_CONTENT);

    }

    @Override
    public ResponseEntity<DataDto<Boolean>> update(IncomeUpdateDto updateDto) {
        Optional<Income> optionalIncome = repository.findByIdAndDeletedFalse(updateDto.getId());
        if (optionalIncome.isEmpty()) {
            return new ResponseEntity<>(new DataDto<>(AppErrorDto
                    .builder()
                    .status(HttpStatus.NOT_FOUND)
                    .message("OutputProduct not found by id : '%s'".formatted(updateDto.getId()))
                    .build()
            ), HttpStatus.CONFLICT);
        }

        Income income = mapper.fromUpdateDto(updateDto, optionalIncome.get());
        repository.save(income);
        return new ResponseEntity<>(new DataDto<>(true), HttpStatus.ACCEPTED);

    }

    @Override
    public ResponseEntity<DataDto<List<IncomeDto>>> getAll() {
        List<Income> incomeList = repository.findAllByDeletedFalse();
        List<IncomeDto> incomeDtos = mapper.toDto(incomeList);
        return new ResponseEntity<>(new DataDto<>(incomeDtos), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<DataDto<IncomeDto>> get(Long id) {
        Optional<Income> income = repository.findByIdAndDeletedFalse(id);
        return new ResponseEntity<>(new DataDto<>(mapper.toDto(income.get())),HttpStatus.OK);
    }

    @Override
    public Long totalCount(IncomeCriteria criteria) {
        return null;
    }
}
