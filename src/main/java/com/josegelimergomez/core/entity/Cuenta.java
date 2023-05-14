package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Builder
@Entity
@Table(name = "tbl_cuenta")
public class Cuenta implements Serializable {


    private static final long serialVersionUID = -2197231302792167820L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_cuenta", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idCuenta;
    @Column(name = "cuen_codigo")
    private String codigo;
    @Column(name = "desc")
    private String descripcion;

    @OneToMany(mappedBy = "cuenta")
    private List<Transaccion> transacciones;

    @OneToOne(mappedBy = "cuenta")
    private Factura factura;

    @OneToOne(mappedBy = "cuenta")
    private Gastos gastos;

}
