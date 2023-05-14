package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tbl_payroll")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Payroll implements Serializable {


    private static final long serialVersionUID = 8079596284232588303L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_payroll", columnDefinition = "BINARY(16)", nullable = false)
    private UUID idPayroll;
    private Date date;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Empleados empleados;
}
