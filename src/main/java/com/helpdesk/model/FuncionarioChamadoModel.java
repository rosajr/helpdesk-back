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
@Table(name = "funcionario_chamado")
public class FuncionarioChamadoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUN_CHA_ID")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "FUN_ID",referencedColumnName = "FUN_ID")
    private FuncionarioModel funcionario;

    @OneToOne
    @JoinColumn(name = "CHA_ID",referencedColumnName = "CHA_ID")
    private ChamadoModel chamado;
}
