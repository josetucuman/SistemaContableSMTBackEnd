package com.josegelimergomez.core.dao;

import com.josegelimergomez.core.entity.Presupuesto;

import java.util.List;

public interface PresupuestoDao {

    Presupuesto createNewPresupuesto(Presupuesto presupuesto);

    List<Presupuesto> getAllPresupuestos();
}
