package com.josegelimergomez.core.dto;

import com.josegelimergomez.core.entity.Ingresos;
import com.josegelimergomez.core.entity.Pagos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PresupuestoDto {
    private List<Pagos> pagos;
    private List<Ingresos> ingresos;
    private Double difIngresoGastoReal;
    private Double gastoTotalReal;
    private Double ingresoTotalReal;
    private Double gastoTotalPresupuestado;
    private Double ingresoTotalPresupuestado;
    private Integer anioFiscal;
}
