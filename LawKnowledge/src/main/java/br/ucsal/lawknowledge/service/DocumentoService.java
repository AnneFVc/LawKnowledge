package br.ucsal.lawknowledge.service;

import br.ucsal.lawknowledge.model.Documento;
import br.ucsal.lawknowledge.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository repository;

    public Documento salvar(Documento doc) {
        return repository.save(doc);
    }

    public List<Documento> listar() {
        return repository.findAll();
    }

    public Optional<Documento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Documento> buscarPorPalavraChave(String palavra) {
        return repository.findByPalavrasChaveContainingIgnoreCase(palavra);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

