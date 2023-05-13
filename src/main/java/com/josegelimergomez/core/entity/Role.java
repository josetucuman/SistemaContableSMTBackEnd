package com.josegelimergomez.core.entity;

import com.josegelimergomez.core.enums.ERole;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rol")
    private Long idRole;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private ERole name;

    @ManyToMany(mappedBy = "roles")
    private Set<Empleados> empleados = new HashSet<>();
}
