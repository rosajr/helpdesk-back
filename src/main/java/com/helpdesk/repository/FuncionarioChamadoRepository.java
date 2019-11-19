package com.helpdesk.repository;

import com.helpdesk.model.FuncionarioChamado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioChamadoRepository extends JpaRepository<FuncionarioChamado,Long> {
    List<FuncionarioChamado> findByFuncionarioId(Long id);
}
