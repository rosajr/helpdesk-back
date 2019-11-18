package com.helpdesk.service;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.dto.ChamadoDto;

import java.util.List;


public interface ChamadoService {
    Chamado add(ChamadoDto chamadoDto);
    Chamado update(ChamadoDto chamadoDto, Integer id);
    Chamado findById(Integer id);
    void delete(Integer id);
    List<Chamado> findAll();
}
