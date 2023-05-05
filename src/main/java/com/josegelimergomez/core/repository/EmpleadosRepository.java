package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {

    List<Empleados>findByApellido(String apellido);
}
