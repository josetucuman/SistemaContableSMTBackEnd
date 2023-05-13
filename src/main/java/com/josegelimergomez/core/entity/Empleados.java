package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Column(name = "emp_username")
    @NotNull
    @Size(min = 4, max = 20)
    private String username;

    @Column(name = "emp_cel")
    @Size(max = 30)
    private String nroCelular;

    @Column(name = "emp_email")
    @Email
    @Size(max = 70)
    private String email;

    @OneToMany(mappedBy = "empleados", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Payroll> payroll;

    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transacciones;

    @OneToMany(mappedBy = "empleado")
    private List<Gastos> gastos;

    @ManyToMany
    @JoinTable(
            name = "empleado_role",
            joinColumns = @JoinColumn(name = "id_employee"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Role> roles = new HashSet<>();

}
