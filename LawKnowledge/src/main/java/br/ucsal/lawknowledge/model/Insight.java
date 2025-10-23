package br.ucsal.lawknowledge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Insight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;
    private String titulo;

    @Lob
    private String texto;

    private LocalDate dataCriacao;

    // Relacionamento (um insight pode estar ligado a um documento)
    @ManyToOne
    private Documento documento;
}