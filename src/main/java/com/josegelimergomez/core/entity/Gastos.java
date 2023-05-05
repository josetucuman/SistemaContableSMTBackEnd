package com.josegelimergomez.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

public class Gastos implements Serializable {

    private static final long serialVersionUID = -5849695544437978250L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_gastos")
    private Long id;
    @Column(name = "gastos_fecha")
    @NotNull
    private LocalDate fecha;
    @NotNull
    @Column(name = "gastos_monto")
    private Double monto;
    @NotNull
    @Column(name = "gastos_nombre")
    private String nombre;


}
