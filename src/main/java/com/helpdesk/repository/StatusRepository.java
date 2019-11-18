package com.helpdesk.repository;

import com.helpdesk.model.Setor;
import com.helpdesk.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
