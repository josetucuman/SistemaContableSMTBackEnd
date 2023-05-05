package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    Cuenta findByCodigo(String codigo);
}
