package br.ucsal.lawknowledge.service;

import br.ucsal.lawknowledge.dto.UsuarioDTO;
import br.ucsal.lawknowledge.mapper.UsuarioMapper;
import br.ucsal.lawknowledge.model.Usuario;
import br.ucsal.lawknowledge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    //  Listar todos
    public List<UsuarioDTO> listarTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Buscar por ID
    public UsuarioDTO buscarPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return usuarioMapper.toDTO(usuario);
    }

    //  Criar novo
    public UsuarioDTO criar(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        Usuario salvo = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(salvo);
    }

    //  Atualizar
    public UsuarioDTO atualizar(Long id, UsuarioDTO usuarioDTO) {
        Usuario existente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existente.setNome(usuarioDTO.getNome());
        existente.setEmail(usuarioDTO.getEmail());
        existente.setCargo(usuarioDTO.getCargo());

        Usuario atualizado = usuarioRepository.save(existente);
        return usuarioMapper.toDTO(atualizado);
    }

    //  Deletar
    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
