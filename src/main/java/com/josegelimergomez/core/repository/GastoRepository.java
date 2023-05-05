package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GastoRepository extends JpaRepository<Gastos, Long> {

    List<Gastos> findByNombre(String nombre);
}
