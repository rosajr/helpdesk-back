package com.helpdesk.controller;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.dto.AlterarStatusChamadoDto;
import com.helpdesk.model.dto.ChamadoDto;
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
    public ResponseEntity<Chamado> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(chamadoService.findById(id));
    }

    @PutMapping(value = "/alterarStatus")
    public ResponseEntity<Chamado> alterarStatus(@RequestBody AlterarStatusChamadoDto alterarStatusChamadoDto){
        return ResponseEntity.ok().body(chamadoService.alterarStatus(alterarStatusChamadoDto));
    }

    @GetMapping
    public ResponseEntity<List<Chamado>> findAll(){
        return ResponseEntity.ok().body(chamadoService.findAll());
    }

    @PostMapping
    public ResponseEntity<Chamado> save(@RequestBody ChamadoDto chamadoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(chamadoService.add(chamadoDto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        chamadoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
