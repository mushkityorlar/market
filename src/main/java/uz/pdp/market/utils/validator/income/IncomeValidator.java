package uz.pdp.market.utils.validator.income;

import org.springframework.stereotype.Component;
import uz.pdp.market.dto.income.IncomeCreateDto;
import uz.pdp.market.dto.income.IncomeUpdateDto;
import uz.pdp.market.utils.BaseUtils;
import uz.pdp.market.utils.validator.AbstractValidator;

import javax.validation.ValidationException;

@Component
public class IncomeValidator extends AbstractValidator<
        IncomeCreateDto,
        IncomeUpdateDto,
        Long> {
    protected IncomeValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(IncomeCreateDto incomeCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(IncomeUpdateDto cd) throws ValidationException {

    }
}
