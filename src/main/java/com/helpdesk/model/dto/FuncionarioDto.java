package com.helpdesk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDto {
   private String nome;
   private Long tipoId;
   private String email;
   private String password;
   private EnderecoDto endereco;
}
