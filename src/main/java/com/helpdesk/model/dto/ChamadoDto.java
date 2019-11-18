package com.helpdesk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChamadoDto {
   private String description;
   private Long setorId;
   private Long funcionarioMat;
   private Long statusId;
}
