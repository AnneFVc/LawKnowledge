package br.ucsal.lawknowledge.dto;

import jakarta.persistence.Lob;

import java.time.LocalDate;

public class DocumentoDTO {

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


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getTribunal() {
                return tribunal;
        }

        public void setTribunal(String tribunal) {
                this.tribunal = tribunal;
        }

        public String getInstancia() {
                return instancia;
        }

        public void setInstancia(String instancia) {
                this.instancia = instancia;
        }

        public LocalDate getData() {
                return data;
        }

        public void setData(LocalDate data) {
                this.data = data;
        }

        public String getPalavrasChave() {
                return palavrasChave;
        }

        public void setPalavrasChave(String palavrasChave) {
                this.palavrasChave = palavrasChave;
        }

        public String getConteudo() {
                return conteudo;
        }

        public void setConteudo(String conteudo) {
                this.conteudo = conteudo;
        }

        public String getTagsGeradas() {
                return tagsGeradas;
        }

        public void setTagsGeradas(String tagsGeradas) {
                this.tagsGeradas = tagsGeradas;
        }
}


