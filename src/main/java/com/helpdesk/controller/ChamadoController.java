package com.helpdesk.controller;

import com.helpdesk.model.ChamadoModel;
import com.helpdesk.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamado")
public class ChamadoController {
    @Autowired
    ChamadoService chamadoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChamadoModel> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(chamadoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ChamadoModel>> findAll(){
        return ResponseEntity.ok().body(chamadoService.findAll());
    }

    @PostMapping
    public ResponseEntity<ChamadoModel> save(@RequestBody ChamadoModel chamadoModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(chamadoService.add(chamadoModel));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        chamadoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
