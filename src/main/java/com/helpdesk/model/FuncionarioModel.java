package com.helpdesk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionario")
public class FuncionarioModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUN_ID")
    private Integer id;

    @Column(name = "FUN_MAT")
    private Integer matricula;

    @Column(name = "FUN_NOME")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FUN_END_ID", referencedColumnName = "END_ID")
    private EnderecoModel endereco;

    @OneToOne
    @JoinColumn(name = "FUN_TIF_ID", referencedColumnName = "TIF_ID")
    private TipoFuncionarioModel tipoFuncionario;


}
