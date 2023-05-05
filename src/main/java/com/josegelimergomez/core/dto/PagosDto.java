package com.josegelimergomez.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data

@AllArgsConstructor
@Builder
public class PagosDto {

    private Long numPago;
    private LocalDate fechaPago;
    private Double monto;

}
