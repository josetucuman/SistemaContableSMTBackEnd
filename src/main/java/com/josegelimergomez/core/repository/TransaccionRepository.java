package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {

}
