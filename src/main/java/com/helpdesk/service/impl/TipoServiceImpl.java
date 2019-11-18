package com.helpdesk.service.impl;

import com.helpdesk.model.Tipo;
import com.helpdesk.repository.TipoRepository;
import com.helpdesk.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServiceImpl implements TipoService {
    @Autowired
    private TipoRepository tipoRepository;
    @Override
    public List<Tipo> findAll() {
        return tipoRepository.findAll();
    }
}
