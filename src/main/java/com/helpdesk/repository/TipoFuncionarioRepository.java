package com.helpdesk.repository;

import com.helpdesk.model.TipoFuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionarioModel, Integer> {
}
