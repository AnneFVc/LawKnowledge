package br.ucsal.lawknowledge.service;

import br.ucsal.lawknowledge.dto.DocumentoDTO;
import br.ucsal.lawknowledge.mapper.DocumentoMapper;
import br.ucsal.lawknowledge.model.Documento;
import br.ucsal.lawknowledge.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocumentoService {
    @Autowired
    private DocumentoRepository repository;
    @Autowired
    private DocumentoMapper mapper;

    public DocumentoDTO salvar(DocumentoDTO doc) {
        Documento documento = mapper.toEntity(doc);
        Documento documentoSalvo = repository.save(documento);
        return mapper.toDTO(documentoSalvo);
    }

    public List<Documento> listar() {
        return repository.findAll();
    }

    public DocumentoDTO findById(Long id) {
        Documento documento = repository.findById(id).orElseThrow(() -> new RuntimeException("Documento não encontrado"));
        return mapper.toDTO(documento);
    }

    public List<Documento> buscarPorPalavraChave(String palavra) {
        return repository.findByPalavrasChaveContainingIgnoreCase(palavra);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

