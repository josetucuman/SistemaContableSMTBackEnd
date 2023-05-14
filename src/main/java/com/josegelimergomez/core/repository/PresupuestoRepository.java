package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, UUID> {

    List<Integer> findByAnioFiscal(Integer anio);
}
