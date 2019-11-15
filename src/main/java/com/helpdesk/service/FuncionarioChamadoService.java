package com.helpdesk.service;

import com.helpdesk.model.FuncionarioChamadoModel;
import com.helpdesk.model.dto.FuncionarioChamadoDto;

import java.util.List;


public interface FuncionarioChamadoService {
    FuncionarioChamadoModel add(FuncionarioChamadoDto dto);
    FuncionarioChamadoModel update(FuncionarioChamadoModel funcionarioChamadoModel, Integer id);
    FuncionarioChamadoModel findById(Integer id);
    void delete(Integer id);
    List<FuncionarioChamadoModel> findAll();
}
