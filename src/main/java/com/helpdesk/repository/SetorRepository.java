package com.helpdesk.repository;

import com.helpdesk.model.Setor;
import com.helpdesk.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetorRepository extends JpaRepository<Setor, Long> {
}
