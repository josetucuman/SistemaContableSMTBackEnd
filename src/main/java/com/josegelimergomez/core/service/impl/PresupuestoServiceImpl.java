package com.josegelimergomez.core.service.impl;

import com.josegelimergomez.core.dao.PresupuestoDao;
import com.josegelimergomez.core.entity.Presupuesto;
import com.josegelimergomez.core.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresupuestoServiceImpl implements PresupuestoService {

    @Autowired
    private PresupuestoDao presupuestoDao;

    @Override
    public Presupuesto crearNuevoPresupuesto(Presupuesto nuevoPresupuesto) {
        return presupuestoDao.createNewPresupuesto(nuevoPresupuesto);
    }

    @Override
    public List<Presupuesto> traerTodosLosPresupuestos() {
        return presupuestoDao.getAllPresupuestos();
    }
}
