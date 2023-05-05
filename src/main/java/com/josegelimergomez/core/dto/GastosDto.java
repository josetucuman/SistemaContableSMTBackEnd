package com.josegelimergomez.core.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GastosDto {

    private LocalDate fecha;
    private Double monto;
    private String nombre;
}
