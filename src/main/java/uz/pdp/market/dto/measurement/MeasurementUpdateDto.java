package uz.pdp.market.dto.measurement;

import lombok.*;
import uz.pdp.market.dto.base.GenericDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MeasurementUpdateDto extends GenericDto {
    private String name;
    private boolean active;

    @Builder(builderMethodName = "childBuilder")
    public MeasurementUpdateDto(Long id, String name, boolean active) {
        super(id);
        this.name = name;
        this.active = active;
    }
}
