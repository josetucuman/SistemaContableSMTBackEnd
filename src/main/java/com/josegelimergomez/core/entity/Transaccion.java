package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tbl_transaccion")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaccion")
    private Long idTransaccion;
    @Column(name = "numero_transaccion")
    private Long numTrasnsaccion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "fecha_transaccion")
    private LocalDate fecha;

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
