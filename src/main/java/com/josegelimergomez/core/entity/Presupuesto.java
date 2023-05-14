package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_presupuesto")
public class Presupuesto {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_presupuesto", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idPresupuesto;
    @Column(name = "anio_fiscal")
    private Integer anioFiscal;
    @Column(name = "ingreso_total_presupuestado")
    private Double ingresoTotalPresupuestado;
    @Column(name = "gasto_total_presupuestado")
    private Double gastoTotalPresupuestado;
    @Column(name = "ingreso_total_real")
    private Double ingresoTotalReal;
    @Column(name = "gasto_total_real")
    private Double gastoTotalReal;
    @Column(name = "dif_ingreso_gasto_real")
    private Double difIngresoGastoReal;

    @OneToMany(mappedBy = "presupuesto")
    private List<Ingresos> ingresos;

    @OneToMany(mappedBy = "presupuesto")
    private List<Pagos> pagos;

}
