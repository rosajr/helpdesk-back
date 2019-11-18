package com.helpdesk.service.impl;

import com.helpdesk.model.FuncionarioChamado;
import com.helpdesk.model.dto.AtribuirChamadoDto;
import com.helpdesk.model.dto.FuncionarioDto;
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
    public FuncionarioChamado add(AtribuirChamadoDto dto) {
        FuncionarioChamado model = new FuncionarioChamado();
        model.setChamado(chamadoService.findById(dto.getChamadoId()));
        model.setFuncionario(funcionarioService.findById(dto.getFuncionarioMat()));
        return funcionarioChamadoRepository.save(model);
    }

    @Override
    public FuncionarioChamado update(FuncionarioChamado funcionarioChamado, Integer id) {
        funcionarioChamado.setId(id);
        return funcionarioChamado;
    }

    @Override
    public FuncionarioChamado findById(Integer id) {
        return funcionarioChamadoRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    funcionarioChamadoRepository.delete(findById(id));
    }

    @Override
    public List<FuncionarioChamado> findAll() {
        return funcionarioChamadoRepository.findAll();
    }
}
