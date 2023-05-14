package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_client")
public class Cliente {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_cliente", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idCliente;
    @Column(name = "cliente_apellido")
    private String apellido;
    @Column(name = "cliente_nombre")
    private String nombre;
    @Column(name = "cliente_contacto")
    private String nroContacto;

    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;

}
