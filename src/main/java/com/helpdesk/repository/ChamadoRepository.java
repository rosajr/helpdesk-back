package com.helpdesk.repository;

import com.helpdesk.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChamadoRepository extends JpaRepository<Chamado,Long> {
    List<Chamado> findByFuncionarioId(Long id);
}
