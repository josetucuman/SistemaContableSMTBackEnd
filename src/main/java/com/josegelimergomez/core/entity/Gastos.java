package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_gastos")
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

    @OneToOne
    @JoinColumn(name = "id_cuenta")
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

}
