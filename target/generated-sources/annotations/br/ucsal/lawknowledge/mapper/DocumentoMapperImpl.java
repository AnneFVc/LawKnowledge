package br.ucsal.lawknowledge.mapper;

import br.ucsal.lawknowledge.dto.DocumentoDTO;
import br.ucsal.lawknowledge.model.Documento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-29T16:39:34-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23-valhalla (Oracle Corporation)"
)
@Component
public class DocumentoMapperImpl implements DocumentoMapper {

    @Override
    public DocumentoDTO toDTO(Documento documento) {
        if ( documento == null ) {
            return null;
        }

        DocumentoDTO documentoDTO = new DocumentoDTO();

        documentoDTO.setId( documento.getId() );
        documentoDTO.setTitulo( documento.getTitulo() );
        documentoDTO.setTipo( documento.getTipo() );
        documentoDTO.setAutor( documento.getAutor() );
        documentoDTO.setTribunal( documento.getTribunal() );
        documentoDTO.setInstancia( documento.getInstancia() );
        documentoDTO.setData( documento.getData() );
        documentoDTO.setPalavrasChave( documento.getPalavrasChave() );
        documentoDTO.setConteudo( documento.getConteudo() );
        documentoDTO.setTagsGeradas( documento.getTagsGeradas() );

        return documentoDTO;
    }

    @Override
    public Documento toEntity(DocumentoDTO documentoDTO) {
        if ( documentoDTO == null ) {
            return null;
        }

        Documento documento = new Documento();

        documento.setId( documentoDTO.getId() );
        documento.setTitulo( documentoDTO.getTitulo() );
        documento.setTipo( documentoDTO.getTipo() );
        documento.setAutor( documentoDTO.getAutor() );
        documento.setTribunal( documentoDTO.getTribunal() );
        documento.setInstancia( documentoDTO.getInstancia() );
        documento.setData( documentoDTO.getData() );
        documento.setPalavrasChave( documentoDTO.getPalavrasChave() );
        documento.setConteudo( documentoDTO.getConteudo() );
        documento.setTagsGeradas( documentoDTO.getTagsGeradas() );

        return documento;
    }

    @Override
    public List<DocumentoDTO> toResponseList(List<Documento> documento) {
        if ( documento == null ) {
            return null;
        }

        List<DocumentoDTO> list = new ArrayList<DocumentoDTO>( documento.size() );
        for ( Documento documento1 : documento ) {
            list.add( toDTO( documento1 ) );
        }

        return list;
    }
}
