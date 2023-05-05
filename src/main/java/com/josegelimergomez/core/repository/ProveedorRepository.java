package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    List<Proveedor> findByRazonSocial(String razonSocial);
}
