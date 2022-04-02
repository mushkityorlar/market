package uz.pdp.market.utils.validator.outputProduct;

import org.springframework.stereotype.Component;
import uz.pdp.market.dto.outputProduct.OutputProductCreateDto;
import uz.pdp.market.dto.outputProduct.OutputProductUpdateDto;
import uz.pdp.market.utils.BaseUtils;
import uz.pdp.market.utils.validator.AbstractValidator;

import javax.validation.ValidationException;

@Component
public class OutputProductValidator extends AbstractValidator<OutputProductCreateDto, OutputProductUpdateDto, Long> {
    protected OutputProductValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(OutputProductCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(OutputProductUpdateDto cd) throws ValidationException {

    }
}
