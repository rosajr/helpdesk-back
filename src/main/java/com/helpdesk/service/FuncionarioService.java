package com.helpdesk.service;

import com.helpdesk.model.Funcionario;
import com.helpdesk.model.dto.FuncionarioDto;

import java.util.List;


public interface FuncionarioService {
    Funcionario add(FuncionarioDto funcionarioDto);
    Funcionario update(FuncionarioDto funcionarioDto, Long id);
    Funcionario findById(Long id);
    void delete(Long id);
    List<Funcionario> findAll();
}
