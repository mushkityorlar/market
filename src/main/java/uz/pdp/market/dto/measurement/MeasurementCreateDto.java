package uz.pdp.market.dto.measurement;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

@Getter
@Setter
@NoArgsConstructor
public class MeasurementCreateDto implements Dto {
    private String name;
    private boolean active;

    @Builder
    public MeasurementCreateDto(String name, boolean active) {
        this.name = name;
        this.active = active;
    }
}
