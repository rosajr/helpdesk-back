package com.helpdesk.service;

import com.helpdesk.model.FuncionarioChamado;
import com.helpdesk.model.dto.AtribuirChamadoDto;
import com.helpdesk.model.dto.FuncionarioDto;

import java.util.List;


public interface FuncionarioChamadoService {
    FuncionarioChamado add(AtribuirChamadoDto dto);
    FuncionarioChamado update(FuncionarioChamado funcionarioChamado, Integer id);
    FuncionarioChamado findById(Integer id);
    void delete(Integer id);
    List<FuncionarioChamado> findAll();
}
