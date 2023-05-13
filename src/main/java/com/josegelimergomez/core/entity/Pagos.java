package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

@AllArgsConstructor
@Entity
@Table(name = "tbl_pagos")
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pagos", nullable = false)
    private Long id;
    @Column(name = "numero_pago")
    private Long numPago;
    @Column(name = "fecha_pago")
    private LocalDate fechaPago;
    @Column(name = "monto_pago")
    private Double monto;

    @ManyToOne
    @JoinColumn(
            name = "id_presupuesto"
    )
    private Presupuesto presupuesto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pagos pagos = (Pagos) o;
        return getId() != null && Objects.equals(getId(), pagos.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
