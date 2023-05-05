package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tbl_client")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;
    @Column(name = "cliente_apellido")
    private String apellido;
    @Column(name = "cliente_nombre")
    private String nombre;
    @Column(name = "cliente_contacto")
    private String nroContacto;

    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return getIdCliente() != null && Objects.equals(getIdCliente(), cliente.getIdCliente());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
