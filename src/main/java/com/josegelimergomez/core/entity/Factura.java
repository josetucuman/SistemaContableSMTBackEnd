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
@Table(name = "tbl_facturacion")
public class Factura implements Serializable {


    private static final long serialVersionUID = -1575051083137503658L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_factura", columnDefinition = "BINARY(16)", nullable = false)
    private UUID id;
    @Column(name = "numero_factura")
    private UUID nroFactura;
    @Column(name = "monto_factura")
    private Double monto;
    @Column(name = "fecha_facturacion")
    private LocalDate fecha;

    @OneToOne
    @JoinColumn(name = "id_cuenta")
    Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


}