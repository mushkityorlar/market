package uz.pdp.market.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.auth.AuthUserDto;
import uz.pdp.market.dto.currency.CurrencyDto;
import uz.pdp.market.entity.auth.AuthUser;
import uz.pdp.market.entity.market.Currency;

@Mapper(componentModel = "spring")
@Component
public interface AuthUserMapper extends uz.pdp.market.mapper.Mapper {

    AuthUserDto toDto(AuthUser user);
}
