package com.helpdesk.model.dto;

import com.helpdesk.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
   private String rua;
   private String bairro;
   private Integer numero;
}
