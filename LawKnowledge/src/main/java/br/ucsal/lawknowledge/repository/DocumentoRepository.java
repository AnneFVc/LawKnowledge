package br.ucsal.lawknowledge.repository;

import br.ucsal.lawknowledge.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    List<Documento> findByPalavrasChaveContainingIgnoreCase(String palavra);
}
