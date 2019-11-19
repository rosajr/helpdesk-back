package com.helpdesk.service;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.FuncionarioChamado;
import com.helpdesk.model.dto.AtribuirChamadoDto;
import com.helpdesk.model.dto.FuncionarioDto;

import java.util.List;


public interface FuncionarioChamadoService {
    FuncionarioChamado add(AtribuirChamadoDto dto);
    FuncionarioChamado update(FuncionarioChamado funcionarioChamado, Long id);
    FuncionarioChamado findById(Long id);
    List<Chamado> findChamadoByFuncionarioId(Long id);
    void delete(Long id);
    List<FuncionarioChamado> findAll();
}
