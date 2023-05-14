package com.josegelimergomez.core.dao.impl;

import com.josegelimergomez.core.dao.PresupuestoDao;
import com.josegelimergomez.core.entity.Presupuesto;
import com.josegelimergomez.core.repository.PresupuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PresupuestoDaoImpl implements PresupuestoDao {

    @Autowired
    private PresupuestoRepository repository;
    @Override
    public Presupuesto createNewPresupuesto(Presupuesto presupuesto) {
        return repository.save(presupuesto);
    }

    @Override
    public List<Presupuesto> getAllPresupuestos() {
        return repository.findAll();
    }
}
