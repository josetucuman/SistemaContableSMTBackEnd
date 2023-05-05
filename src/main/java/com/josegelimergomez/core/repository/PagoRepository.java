package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagoRepository extends JpaRepository<Pagos, Long> {

    List<Pagos> findByNumPago(long numPago);
}
