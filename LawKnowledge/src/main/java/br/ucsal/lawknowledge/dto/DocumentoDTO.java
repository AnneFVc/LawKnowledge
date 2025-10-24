package br.ucsal.lawknowledge.dto;

public class DocumentoDTO {

        private Long id;
        private String titulo;
        private String tipo; // Jurisprudência, Parecer, Petição etc
        private String descricao;
        private String autor;
        private String dataUpload;

        // Getters e Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public String getDescricao() { return descricao; }
        public void setDescricao(String descricao) { this.descricao = descricao; }

        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }

        public String getDataUpload() { return dataUpload; }
        public void setDataUpload(String dataUpload) { this.dataUpload = dataUpload; }
    }


