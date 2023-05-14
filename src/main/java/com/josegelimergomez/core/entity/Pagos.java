package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

@AllArgsConstructor
@Entity
@Table(name = "tbl_pagos")
public class Pagos implements Serializable {


    private static final long serialVersionUID = -2664753801278742208L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_pagos", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idPagos;
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


}
