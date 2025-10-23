package br.ucsal.lawknowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ucsal.lawknowledge.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}