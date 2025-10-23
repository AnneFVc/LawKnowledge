package br.ucsal.lawknowledge.controller;

import br.ucsal.lawknowledge.model.Documento;
import br.ucsal.lawknowledge.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/documentos")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController {

    @Autowired
    private DocumentoService service;

    @PostMapping
    public Documento salvar(@RequestBody Documento doc) {
        return service.salvar(doc);
    }

    @GetMapping
    public List<Documento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Documento> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @GetMapping("/buscar")
    public List<Documento> buscarPorPalavra(@RequestParam String palavra) {
        return service.buscarPorPalavraChave(palavra);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}