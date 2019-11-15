package com.helpdesk.controller;

import com.helpdesk.model.FuncionarioModel;
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
    FuncionarioService funcionarioService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuncionarioModel> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(funcionarioService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> findAll(){
        return ResponseEntity.ok().body(funcionarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> save(@RequestBody FuncionarioModel funcionarioModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.add(funcionarioModel));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        funcionarioService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
