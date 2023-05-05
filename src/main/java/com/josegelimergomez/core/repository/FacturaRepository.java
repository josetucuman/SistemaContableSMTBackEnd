package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

    Factura findByNumeroFactura(Long numero);
}
