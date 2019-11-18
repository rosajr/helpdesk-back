package com.helpdesk.controller;

import com.helpdesk.model.Status;
import com.helpdesk.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @GetMapping
    public ResponseEntity<List<Status>> findAll(){
        return ResponseEntity.ok().body(statusService.findAll());
    }
}
