package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tbl_payroll")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payroll")
    private Long id;
    private Date date;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Empleados empleados;
}
