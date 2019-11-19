package com.helpdesk.controller;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.FuncionarioChamado;
import com.helpdesk.model.dto.AtribuirChamadoDto;
import com.helpdesk.model.dto.FuncionarioDto;
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
    public ResponseEntity<FuncionarioChamado> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(funcionarioChamadoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioChamado>> findAll(){
        return ResponseEntity.ok().body(funcionarioChamadoService.findAll());
    }

    @GetMapping(value = "funcionario/{id}")
    public ResponseEntity<List<Chamado>> findByFuncionarioId(@PathVariable Long id){
        return ResponseEntity.ok().body(funcionarioChamadoService.findChamadoByFuncionarioId(id));
    }

    @PostMapping
    public ResponseEntity<FuncionarioChamado> atribuirChamado(@RequestBody AtribuirChamadoDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioChamadoService.add(dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        funcionarioChamadoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
