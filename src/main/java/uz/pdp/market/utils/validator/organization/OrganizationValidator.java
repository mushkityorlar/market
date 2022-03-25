package uz.pdp.market.utils.validator.organization;

import org.springframework.stereotype.Component;
import uz.pdp.market.dto.organization.OrganizationCreateDto;
import uz.pdp.market.dto.organization.OrganizationUpdateDto;
import uz.pdp.market.utils.BaseUtils;
import uz.pdp.market.utils.validator.AbstractValidator;
import uz.pdp.market.utils.validator.Validator;

import javax.validation.ValidationException;


@Component
public class OrganizationValidator extends AbstractValidator<OrganizationCreateDto, OrganizationUpdateDto,Long> implements Validator {
    protected OrganizationValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(OrganizationCreateDto createDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(OrganizationUpdateDto cd) throws ValidationException {

    }
}
