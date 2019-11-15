package com.helpdesk.controller;

import com.helpdesk.model.FuncionarioChamadoModel;
import com.helpdesk.model.dto.FuncionarioChamadoDto;
import com.helpdesk.service.FuncionarioChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarioChamado")
public class FuncionarioChamadoController {
    @Autowired
    FuncionarioChamadoService funcionarioChamadoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuncionarioChamadoModel> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(funcionarioChamadoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioChamadoModel>> findAll(){
        return ResponseEntity.ok().body(funcionarioChamadoService.findAll());
    }

    @PostMapping
    public ResponseEntity<FuncionarioChamadoModel> save(@RequestBody FuncionarioChamadoDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioChamadoService.add(dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        funcionarioChamadoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
