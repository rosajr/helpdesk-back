package com.helpdesk.repository;

import com.helpdesk.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Integer> {
}
