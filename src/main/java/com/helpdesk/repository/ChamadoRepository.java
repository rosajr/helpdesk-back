package com.helpdesk.repository;

import com.helpdesk.model.ChamadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<ChamadoModel,Integer> {
}
