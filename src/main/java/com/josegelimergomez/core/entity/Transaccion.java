package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tbl_transaccion")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaccion implements Serializable {


    private static final long serialVersionUID = -3420300021716209506L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_transaccion", columnDefinition = "BINARY(16)")
    private UUID idTransaccion;
    @Column(name = "numero_transaccion")
    private Long numTrasnsaccion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "fecha_transaccion")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_cuenta")
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleados empleado;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaccion that = (Transaccion) o;
        return Objects.equals(idTransaccion, that.idTransaccion) && Objects.equals(descripcion, that.descripcion) && Objects.equals(monto, that.monto) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransaccion, descripcion, monto, fecha);
    }
}
