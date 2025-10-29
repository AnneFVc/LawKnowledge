package br.ucsal.lawknowledge.controller;

import br.ucsal.lawknowledge.dto.DocumentoDTO;
import br.ucsal.lawknowledge.model.Documento;
import br.ucsal.lawknowledge.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documentos")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController {

    @Autowired
    private DocumentoService service;

    @PostMapping
    public ResponseEntity<DocumentoDTO> salvar(@RequestBody DocumentoDTO doc) {
        return ResponseEntity.ok(service.salvar(doc));
    }

    @GetMapping
    public List<Documento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DocumentoDTO findById(@PathVariable Long id) {
        return service.findById(id);
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