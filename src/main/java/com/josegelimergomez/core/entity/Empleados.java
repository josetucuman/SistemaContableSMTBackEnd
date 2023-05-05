package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "tbl_employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleados implements Serializable {

    private static final long serialVersionUID = -5788327401301636491L;

    @Id
    @GeneratedValue
    @Column(name = "id_employee")
    private Long idEmpleado;

    @Column(name = "emp_ape", nullable = false)
    @Size(max = 80)
    private String apellido;
    @Column(name = "emp_nom", nullable = false)
    @Size(max = 80)
    private String nombre;

    @Column(name = "emp_cel")
    @Size(max = 30)
    private String nroCelular;

    @Column(name = "emp_email")
    @Email
    @Size(max = 70)
    private String email;


}
