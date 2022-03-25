package uz.pdp.market.dto.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.market.dto.base.GenericDto;
import uz.pdp.market.entity.market.Category;
import uz.pdp.market.entity.market.Market;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto extends GenericDto {
    private String name;

    private String imgPath;

    private Category category;

    private List<Market> markets;

    @Builder(builderMethodName = "childBuilder")
    public ProductDto(Long id, String name, String imgPath, Category category, List<Market> markets) {
        super(id);
        this.name = name;
        this.imgPath = imgPath;
        this.category = category;
        this.markets = markets;
    }
}
