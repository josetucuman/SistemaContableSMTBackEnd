package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl__sist_cont_facturacion")
public class Factura implements Serializable {


    private static final long serialVersionUID = -1575051083137503658L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_factura")
    private Long id;

    private Long nroFactura;
    private Double monto;

    private LocalDate fecha;
}