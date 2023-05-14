package com.josegelimergomez.core.util;

import com.josegelimergomez.core.dto.PresupuestoDto;
import com.josegelimergomez.core.entity.Presupuesto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class Convertir {
    PresupuestoDto presupuestoDto;
    Presupuesto presupuestoEntity;

    public Presupuesto convertirAEnity(PresupuestoDto presupuestoDto){
        Presupuesto presupuestoConvertido = new Presupuesto();
        BeanUtils.copyProperties(presupuestoDto, presupuestoConvertido);
        return presupuestoConvertido;
    }

    public PresupuestoDto convertirADto(Presupuesto presupuesto){
        PresupuestoDto presupuestoDtoConvertido = PresupuestoDto.builder()
                .ingresoTotalReal(presupuesto.getIngresoTotalReal())
                .gastoTotalPresupuestado(presupuesto.getGastoTotalPresupuestado())
                .anioFiscal(presupuesto.getAnioFiscal())
                .difIngresoGastoReal(presupuesto.getDifIngresoGastoReal())
                .gastoTotalReal(presupuesto.getGastoTotalReal())
                .ingresoTotalPresupuestado(presupuesto.getIngresoTotalPresupuestado())
                .build();

        return presupuestoDtoConvertido;
    }

}
