package com.helpdesk.service.impl;

import com.helpdesk.model.FuncionarioChamadoModel;
import com.helpdesk.model.dto.FuncionarioChamadoDto;
import com.helpdesk.repository.FuncionarioChamadoRepository;
import com.helpdesk.service.ChamadoService;
import com.helpdesk.service.FuncionarioChamadoService;
import com.helpdesk.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioChamadoServiceImpl implements FuncionarioChamadoService {
    @Autowired
    private FuncionarioChamadoRepository funcionarioChamadoRepository;
    @Autowired
    private FuncionarioService funcionarioService;
    @Autowired
    private ChamadoService chamadoService;

    @Override
    public FuncionarioChamadoModel add(FuncionarioChamadoDto dto) {
        FuncionarioChamadoModel model = new FuncionarioChamadoModel();
        model.setChamado(chamadoService.findById(dto.getChaId()));
        model.setFuncionario(funcionarioService.findById(dto.getFunId()));
        return funcionarioChamadoRepository.save(model);
    }

    @Override
    public FuncionarioChamadoModel update(FuncionarioChamadoModel funcionarioChamadoModel, Integer id) {
        funcionarioChamadoModel.setId(id);
        return funcionarioChamadoModel;
    }

    @Override
    public FuncionarioChamadoModel findById(Integer id) {
        return funcionarioChamadoRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    funcionarioChamadoRepository.delete(findById(id));
    }

    @Override
    public List<FuncionarioChamadoModel> findAll() {
        return funcionarioChamadoRepository.findAll();
    }
}
