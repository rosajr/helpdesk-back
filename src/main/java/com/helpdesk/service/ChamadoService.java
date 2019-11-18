package com.helpdesk.service;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.dto.AlterarStatusChamadoDto;
import com.helpdesk.model.dto.ChamadoDto;

import java.util.List;


public interface ChamadoService {
    Chamado alterarStatus(AlterarStatusChamadoDto alterarStatusChamadoDto);
    Chamado add(ChamadoDto chamadoDto);
    Chamado update(ChamadoDto chamadoDto, Long id);
    Chamado findById(Long id);
    void delete(Long id);
    List<Chamado> findAll();
}
