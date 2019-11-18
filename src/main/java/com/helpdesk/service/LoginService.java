package com.helpdesk.service;

import com.helpdesk.model.Funcionario;
import com.helpdesk.model.Tipo;
import com.helpdesk.model.dto.LoginDto;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface LoginService {
    ResponseEntity login(LoginDto loginDto);
}
