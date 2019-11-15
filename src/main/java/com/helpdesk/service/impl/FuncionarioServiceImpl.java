package com.helpdesk.service.impl;

import com.helpdesk.model.FuncionarioModel;
import com.helpdesk.repository.FuncionarioRepository;
import com.helpdesk.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioModel add(FuncionarioModel funcionarioModel) {
        return funcionarioRepository.save(funcionarioModel);
    }

    @Override
    public FuncionarioModel update(FuncionarioModel funcionarioModel, Integer id) {
        funcionarioModel.setId(id);
        return funcionarioModel;
    }

    @Override
    public FuncionarioModel findById(Integer id) {
        return funcionarioRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    funcionarioRepository.delete(findById(id));
    }

    @Override
    public List<FuncionarioModel> findAll() {
        return funcionarioRepository.findAll();
    }
}
