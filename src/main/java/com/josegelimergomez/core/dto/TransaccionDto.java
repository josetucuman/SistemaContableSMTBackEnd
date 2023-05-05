package com.josegelimergomez.core.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TransaccionDto {
    private String descripcion;
    private Double monto;
    private LocalDate fecha;
}
