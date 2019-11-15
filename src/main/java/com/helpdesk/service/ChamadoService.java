package com.helpdesk.service;

import com.helpdesk.model.ChamadoModel;

import java.util.List;


public interface ChamadoService {
    ChamadoModel add(ChamadoModel chamadoModel);
    ChamadoModel update(ChamadoModel chamadoModel, Integer id);
    ChamadoModel findById(Integer id);
    void delete(Integer id);
    List<ChamadoModel> findAll();
}
