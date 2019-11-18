package com.helpdesk.service.impl;

import com.helpdesk.model.Endereco;
import com.helpdesk.model.Funcionario;
import com.helpdesk.model.Usuario;
import com.helpdesk.model.dto.FuncionarioDto;
import com.helpdesk.repository.FuncionarioRepository;
import com.helpdesk.repository.TipoRepository;
import com.helpdesk.repository.UsuarioRepository;
import com.helpdesk.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private TipoRepository tipoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Funcionario add(FuncionarioDto funcionarioDto) {
        Endereco endereco = new Endereco();
        endereco.setBairro(funcionarioDto.getEndereco().getBairro());
        endereco.setNumero(funcionarioDto.getEndereco().getNumero());
        endereco.setRua(funcionarioDto.getEndereco().getRua());

        Funcionario funcionario = new Funcionario();

        funcionario.setEndereco(endereco);
        funcionario.setNome(funcionarioDto.getNome());
        funcionario.setTipo(tipoRepository.findById(funcionarioDto.getTipoId()).get());
        funcionarioRepository.save(funcionario);

        Usuario usuario = new Usuario();
        usuario.setFuncionario(funcionario);
        usuario.setEmail(funcionarioDto.getEmail());
        usuario.setPassword(funcionarioDto.getPassword());

        usuarioRepository.save(usuario);

        return funcionario;
    }

    @Override
    public Funcionario update(FuncionarioDto funcionarioDto, Long id) {

        Funcionario funcionario = funcionarioRepository.findById(id).get();

        Endereco endereco = funcionario.getEndereco();
        endereco.setBairro(funcionarioDto.getEndereco().getBairro());
        endereco.setNumero(funcionarioDto.getEndereco().getNumero());
        endereco.setRua(funcionarioDto.getEndereco().getRua());


        funcionario.setEndereco(endereco);
        funcionario.setNome(funcionarioDto.getNome());
        funcionario.setTipo(tipoRepository.findById(funcionarioDto.getTipoId()).get());

        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Funcionario findById(Long id) {
        return funcionarioRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
    funcionarioRepository.delete(findById(id));
    }

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }
}
