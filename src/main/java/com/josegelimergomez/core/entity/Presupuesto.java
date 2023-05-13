package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_presupuesto")
public class Presupuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_presupuesto")
    private Long idPresupuesto;

    private Date anioFiscal;
    private Double ingresoTotalPresupuestado;
    private Double gastoTotalPresupuestado;
    private Double ingresoTotalReal;
    private Double gastoTotalReal;
    private Double difIngresoGastoReal;

    @OneToMany(mappedBy = "presupuesto")
    private List<Ingresos> ingresos;

    @OneToMany(mappedBy = "presupuesto")
    private List<Pagos> pagos;

}
