package uz.pdp.market.mapper;

import uz.pdp.market.dto.organization.OrganizationCreateDto;
import uz.pdp.market.dto.organization.OrganizationDto;
import uz.pdp.market.dto.organization.OrganizationUpdateDto;
import uz.pdp.market.entity.organization.Organization;

import java.util.List;

public interface OrganizationMapper extends BaseMapper<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto>{

    @Override
    OrganizationDto toDto(Organization organization);

    @Override
    List<OrganizationDto> toDto(List<Organization> e);

    @Override
    Organization fromCreateDto(OrganizationCreateDto organizationCreateDto);

    @Override
    Organization fromUpdateDto(OrganizationUpdateDto d);
}
