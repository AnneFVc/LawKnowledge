package br.ucsal.lawknowledge.mapper;

import br.ucsal.lawknowledge.dto.InsightDTO;
import br.ucsal.lawknowledge.model.Insight;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InsightMapper {
    InsightMapper INSTANCE = Mappers.getMapper(InsightMapper.class);

    InsightDTO toDTO(Insight insight);
    Insight toEntity(InsightDTO insightDTO);
}