package br.ucsal.lawknowledge.mapper;


import br.ucsal.lawknowledge.dto.UsuarioDTO;
import br.ucsal.lawknowledge.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
        UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

        UsuarioDTO toDTO(Usuario usuario);
        Usuario toEntity(UsuarioDTO usuarioDTO);
}


