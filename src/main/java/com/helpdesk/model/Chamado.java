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
@Table(name = "tb_chamado",schema = "helpdesk")
public class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHA_ID")
    private Long id;

    @Column(name = "CHA_DESCRICAO")
    private String description;

    @OneToOne
    @JoinColumn(name = "CHA_SET_ID",referencedColumnName = "SET_ID")
    private Setor setor;

    @OneToOne
    @JoinColumn(name = "CHA_FUN_MAT",referencedColumnName = "FUN_MATRICULA")
    private Funcionario funcionario;

    @OneToOne
    @JoinColumn(name = "CHA_STA_ID",referencedColumnName = "STA_ID")
    private Status status;
}
