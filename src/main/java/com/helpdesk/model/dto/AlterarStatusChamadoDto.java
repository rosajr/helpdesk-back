package com.helpdesk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlterarStatusChamadoDto {
   private Long chamadoId;
   private Long statusId;
}
