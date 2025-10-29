package br.ucsal.lawknowledge.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String tipo; // parecer, jurisprudência, modelo
    private String autor;
    private String tribunal;
    private String instancia;
    private LocalDate data;
    private String palavrasChave;
    @Lob
    private String conteudo;
    private String tagsGeradas;

    // Getters e Setters
}