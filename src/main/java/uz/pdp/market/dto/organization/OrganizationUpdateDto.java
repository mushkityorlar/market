package uz.pdp.market.dto.organization;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;


@Getter
@Setter
@NoArgsConstructor
public class OrganizationUpdateDto extends GenericDto {
    private String name;
    private String email;
    private String code;
    private String website;

    @Builder(builderMethodName = "childBuilder")
    public OrganizationUpdateDto(Long id, String name, String email, String code, String website) {
        super(id);
        this.name = name;
        this.email = email;
        this.code = code;
        this.website = website;
    }
}
