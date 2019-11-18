package com.helpdesk.controller;

import com.helpdesk.model.Tipo;
import com.helpdesk.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo")
public class TipoController {
    @Autowired
    private TipoService tipoService;
    @GetMapping
    public ResponseEntity<List<Tipo>> findAll(){
        return ResponseEntity.ok().body(tipoService.findAll());
    }
}
