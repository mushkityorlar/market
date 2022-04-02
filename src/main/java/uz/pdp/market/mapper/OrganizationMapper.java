package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.organization.OrganizationCreateDto;
import uz.pdp.market.dto.organization.OrganizationDto;
import uz.pdp.market.dto.organization.OrganizationUpdateDto;
import uz.pdp.market.entity.organization.Organization;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface OrganizationMapper extends BaseMapper<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto> {

    @Override
    OrganizationDto toDto(Organization organization);

    @Override
    List<OrganizationDto> toDto(List<Organization> e);

    @Override
    Organization fromCreateDto(OrganizationCreateDto organizationCreateDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Organization fromUpdateDto(OrganizationUpdateDto d, @MappingTarget Organization organization);
}
