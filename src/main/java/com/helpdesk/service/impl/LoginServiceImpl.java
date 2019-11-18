package com.helpdesk.service.impl;

import com.helpdesk.model.Funcionario;
import com.helpdesk.model.Tipo;
import com.helpdesk.model.dto.LoginDto;
import com.helpdesk.repository.TipoRepository;
import com.helpdesk.repository.UsuarioRepository;
import com.helpdesk.service.LoginService;
import com.helpdesk.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    private Funcionario funcionario = null;

    @Override
    public synchronized ResponseEntity<Funcionario> login(LoginDto loginDto) {
        funcionario=null;
        usuarioRepository.findAll().forEach(usuario -> {
            if ((usuario.getEmail().equals(loginDto.getEmail())) && (usuario.getPassword().equals(loginDto.getPassword())))
                funcionario=usuario.getFuncionario();
        });
        if(funcionario!=null)
            return ResponseEntity.ok().body(funcionario);
        else
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
