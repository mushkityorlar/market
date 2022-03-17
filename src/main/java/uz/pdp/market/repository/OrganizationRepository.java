package uz.pdp.market.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.market.entity.organization.Organization;
import uz.pdp.market.mapper.OrganizationMapper;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
