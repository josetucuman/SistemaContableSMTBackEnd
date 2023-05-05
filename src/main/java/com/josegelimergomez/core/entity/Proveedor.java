package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_proveedor")
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor implements Serializable {

    private static final long serialVersionUID = -8685028066877669412L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_proveedor", nullable = false)
    private Long idProveedor;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "proveedor_direccion")
    private String direccion;
    @Column(name = "proveedor_num_contacto")
    private String nroContacto;
    @Column(name = "proveedor_url_site")
    private String webSite;

    @OneToMany(mappedBy = "proveedor")
    private List<Factura> facturas;

    @OneToMany(mappedBy = "proveedor")
    private List<Gastos> gastos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Proveedor proveedor = (Proveedor) o;
        return getIdProveedor() != null && Objects.equals(getIdProveedor(), proveedor.getIdProveedor());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
