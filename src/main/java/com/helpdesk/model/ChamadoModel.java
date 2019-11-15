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
@Table(name = "chamado",schema = "helpdesk")
public class ChamadoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHA_ID")
    private Integer id;

    @Column(name = "CHA_MOTIVO")
    private String motivo;

    @Column(name = "CHA_SETOR")
    private String setor;

    @OneToOne
    @JoinColumn(name = "CHA_FUN_ID",referencedColumnName = "FUN_ID")
    private FuncionarioModel funcionario;
}
