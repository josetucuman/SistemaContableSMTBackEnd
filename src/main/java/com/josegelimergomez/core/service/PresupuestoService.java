package com.josegelimergomez.core.service;

import com.josegelimergomez.core.entity.Presupuesto;

import java.util.List;

public interface PresupuestoService {

    Presupuesto crearNuevoPresupuesto(Presupuesto nuevoPresupuesto);

    List<Presupuesto> traerTodosLosPresupuestos();
}
