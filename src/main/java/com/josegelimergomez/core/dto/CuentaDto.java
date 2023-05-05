package com.josegelimergomez.core.dto;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Builder
public class CuentaDto {

    private String codigo;
    private String descripcion;
}
