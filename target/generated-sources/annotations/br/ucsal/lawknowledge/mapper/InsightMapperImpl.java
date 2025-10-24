package br.ucsal.lawknowledge.mapper;

import br.ucsal.lawknowledge.dto.InsightDTO;
import br.ucsal.lawknowledge.model.Insight;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-24T07:30:17-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class InsightMapperImpl implements InsightMapper {

    @Override
    public InsightDTO toDTO(Insight insight) {
        if ( insight == null ) {
            return null;
        }

        InsightDTO insightDTO = new InsightDTO();

        return insightDTO;
    }

    @Override
    public Insight toEntity(InsightDTO insightDTO) {
        if ( insightDTO == null ) {
            return null;
        }

        Insight insight = new Insight();

        return insight;
    }
}
