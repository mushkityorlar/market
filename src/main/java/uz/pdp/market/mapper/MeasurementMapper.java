package uz.pdp.market.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.pdp.market.dto.measurement.MeasurementCreateDto;
import uz.pdp.market.dto.measurement.MeasurementDto;
import uz.pdp.market.dto.measurement.MeasurementUpdateDto;
import uz.pdp.market.entity.market.Measurement;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface MeasurementMapper extends BaseMapper<
        Measurement,
        MeasurementDto,
        MeasurementCreateDto,
        MeasurementUpdateDto> {
    @Override
    MeasurementDto toDto(Measurement measurement);

    @Override
    List<MeasurementDto> toDto(List<Measurement> e);

    @Override
    Measurement fromCreateDto(MeasurementCreateDto measurementCreateDto);

    @Override
    Measurement fromUpdateDto(MeasurementUpdateDto d);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Measurement fromUpdateDto(MeasurementUpdateDto d, @MappingTarget Measurement measurement);
}
