package com.josegelimergomez.core.repository;

import com.josegelimergomez.core.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente>findByApellido(String apellido);
}
