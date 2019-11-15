package com.helpdesk.service;

import com.helpdesk.model.FuncionarioModel;

import java.util.List;


public interface FuncionarioService {
    FuncionarioModel add(FuncionarioModel funcionarioModel);
    FuncionarioModel update(FuncionarioModel funcionarioModel, Integer id);
    FuncionarioModel findById(Integer id);
    void delete(Integer id);
    List<FuncionarioModel> findAll();
}
