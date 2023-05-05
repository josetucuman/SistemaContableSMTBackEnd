package com.josegelimergomez.core.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProveedorDto {

    private String razonSocial;
    private String direccion;
    private String nroContacto;
    private String webSite;
}
