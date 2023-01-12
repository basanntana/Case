package br.com.casesenha.repository;

import br.com.casesenha.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository< UsuarioModel, String> {

    public Optional<UsuarioModel> findByUsuario(String usuario);

    public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);

    public UsuarioModel findByNome(String nome);



}
