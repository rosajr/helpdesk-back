package com.helpdesk.service.impl;

import com.helpdesk.model.ChamadoModel;
import com.helpdesk.repository.ChamadoRepository;
import com.helpdesk.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoServiceImpl implements ChamadoService {
    @Autowired
    private ChamadoRepository chamadoRepository;

    @Override
    public ChamadoModel add(ChamadoModel chamadoModel) {
        return chamadoRepository.save(chamadoModel);
    }

    @Override
    public ChamadoModel update(ChamadoModel chamadoModel, Integer id) {
        chamadoModel.setId(id);
        return chamadoModel;
    }

    @Override
    public ChamadoModel findById(Integer id) {
        return chamadoRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
    chamadoRepository.delete(findById(id));
    }

    @Override
    public List<ChamadoModel> findAll() {
        return chamadoRepository.findAll();
    }
}
