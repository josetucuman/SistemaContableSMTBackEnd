package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_ingresos")
public class Ingresos implements Serializable {


    private static final long serialVersionUID = 1151510056951721912L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_ingresos", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idIngresos;

    private String descripcion;
    private Double monto;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_presupuesto")
    private Presupuesto presupuesto;
}
