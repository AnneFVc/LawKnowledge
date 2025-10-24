package br.ucsal.lawknowledge.mapper;


import br.ucsal.lawknowledge.dto.DocumentoDTO;
import br.ucsal.lawknowledge.model.Documento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DocumentoMapper {
    DocumentoMapper INSTANCE = Mappers.getMapper(DocumentoMapper.class);

    DocumentoDTO toDTO(Documento documento);

    Documento toEntity(DocumentoDTO documentoDTO);
}


