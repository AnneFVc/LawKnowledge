package br.ucsal.lawknowledge.service;

import br.ucsal.lawknowledge.model.Documento;
import br.ucsal.lawknowledge.model.Insight;
import br.ucsal.lawknowledge.repository.InsightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsightService {

    @Autowired
    private InsightRepository repository;

    public Insight salvar(Insight insight) {
        return repository.save(insight);
    }

    public List<Insight> listar() {
        return repository.findAll();
    }

    public List<Insight> listarPorDocumento(Documento doc) {
        return repository.findByDocumento(doc);
    }
    
}