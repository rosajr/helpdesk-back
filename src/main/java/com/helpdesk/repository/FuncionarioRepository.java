package com.helpdesk.repository;

import com.helpdesk.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
    List<Funcionario> findByTipoId(Long id);
}
