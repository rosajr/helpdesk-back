package com.helpdesk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtribuirChamadoDto {
   private Long funcionarioMat;
   private Long chamadoId;
}
