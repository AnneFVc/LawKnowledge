package br.ucsal.lawknowledge.controller;

import br.ucsal.lawknowledge.model.Insight;
import br.ucsal.lawknowledge.service.InsightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insights")
@CrossOrigin(origins = "http://localhost:4200")
public class InsightController {

    @Autowired
    private InsightService service;

    @PostMapping
    public Insight salvar(@RequestBody Insight insight) {
        return service.salvar(insight);
    }

    @GetMapping
    public List<Insight> listar() {
        return service.listar();
    }
}