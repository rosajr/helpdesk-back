package com.helpdesk.service.impl;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.dto.ChamadoDto;
import com.helpdesk.repository.ChamadoRepository;
import com.helpdesk.repository.FuncionarioRepository;
import com.helpdesk.repository.SetorRepository;
import com.helpdesk.repository.StatusRepository;
import com.helpdesk.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoServiceImpl implements ChamadoService {
    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private SetorRepository setorRepository;
    @Autowired
    private StatusRepository statusRepository;


    @Override
    public Chamado add(ChamadoDto chamadoDto) {
        Chamado chamado = new Chamado();
        chamado.setDescription(chamadoDto.getDescription());
        chamado.setFuncionario(funcionarioRepository.findById(chamadoDto.getFuncionarioMat()).get());
        chamado.setSetor(setorRepository.findById(chamadoDto.getSetorId()).get());
        chamado.setStatus(statusRepository.findById(chamadoDto.getStatusId()).get());
        return chamadoRepository.save(chamado);
    }

    @Override
    public Chamado update(ChamadoDto chamadoDto, Integer id) {
        Chamado chamado = findById(id);
        chamado.setDescription(chamadoDto.getDescription());
        chamado.setFuncionario(funcionarioRepository.findById(chamadoDto.getFuncionarioMat()).get());
        chamado.setSetor(setorRepository.findById(chamadoDto.getSetorId()).get());
        chamado.setStatus(statusRepository.findById(chamadoDto.getStatusId()).get());
        return chamadoRepository.save(chamado);
    }

    @Override
    public Chamado findById(Integer id) {
        return chamadoRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    chamadoRepository.delete(findById(id));
    }

    @Override
    public List<Chamado> findAll() {
        return chamadoRepository.findAll();
    }
}
