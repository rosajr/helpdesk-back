package com.helpdesk.controller;

import com.helpdesk.model.Funcionario;
import com.helpdesk.model.dto.FuncionarioDto;
import com.helpdesk.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long matricula){
        return ResponseEntity.ok().body(funcionarioService.findById(matricula));
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        return ResponseEntity.ok().body(funcionarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<Funcionario> save(@RequestBody FuncionarioDto funcionarioDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.add(funcionarioDto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Long matricula){
        funcionarioService.delete(matricula);
        return ResponseEntity.noContent().build();
    }



}
