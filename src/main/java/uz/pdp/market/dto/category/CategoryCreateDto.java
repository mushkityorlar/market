package uz.pdp.market.dto.category;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.Dto;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class CategoryCreateDto implements Dto {
    @Schema(required = true)
    @NotBlank(message = "Category name cannot be null or blank")
    private String name;

    @Builder
    public CategoryCreateDto(String name) {
        this.name = name;
    }
}