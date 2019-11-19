package com.helpdesk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_funcionario")
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUN_MATRICULA")
    private Long id;

    @Column(name = "FUN_NOME")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FUN_END_ID", referencedColumnName = "END_ID")
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "FUN_TPO_ID", referencedColumnName = "TPO_ID")
    private Tipo tipo;


}
