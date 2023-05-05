package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_ingresos")
public class Ingresos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Double monto;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_presupuesto")
    private Presupuesto presupuesto;
}
