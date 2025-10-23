package br.ucsal.lawknowledge.repository;

import br.ucsal.lawknowledge.model.Insight;
import br.ucsal.lawknowledge.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsightRepository extends JpaRepository<Insight, Long> {
    List<Insight> findByDocumento(Documento documento);
}

