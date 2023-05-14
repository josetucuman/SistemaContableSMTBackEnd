package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

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
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_proveedor", columnDefinition = "BINARY(16)")
    private UUID idProveedor;
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
