package uz.pdp.market.dto.currency;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.pdp.market.dto.base.Dto;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyCreateDto implements Dto {

    @Schema(required = true)
    @NotBlank(message = "Currency name cannot be null or blank")
    private String name;
}
