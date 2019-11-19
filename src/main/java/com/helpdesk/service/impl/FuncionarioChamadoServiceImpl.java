package com.helpdesk.service.impl;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.FuncionarioChamado;
import com.helpdesk.model.dto.AtribuirChamadoDto;
import com.helpdesk.model.dto.FuncionarioDto;
import com.helpdesk.repository.FuncionarioChamadoRepository;
import com.helpdesk.service.ChamadoService;
import com.helpdesk.service.FuncionarioChamadoService;
import com.helpdesk.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public FuncionarioChamado update(FuncionarioChamado funcionarioChamado, Long id) {
        funcionarioChamado.setId(id);
        return funcionarioChamado;
    }

    @Override
    public FuncionarioChamado findById(Long id) {
        return funcionarioChamadoRepository.findById(id).get();
    }

    @Override
    public List<Chamado> findChamadoByFuncionarioId(Long id) {
        List<Chamado> chamados = new ArrayList<>();
       funcionarioChamadoRepository.findByFuncionarioId(id).forEach(funcionarioChamado -> {
           chamados.add(funcionarioChamado.getChamado());
       });
       return chamados;
    }


    @Override
    public void delete(Long id) {
    funcionarioChamadoRepository.delete(findById(id));
    }

    @Override
    public List<FuncionarioChamado> findAll() {
        return funcionarioChamadoRepository.findAll();
    }
}
