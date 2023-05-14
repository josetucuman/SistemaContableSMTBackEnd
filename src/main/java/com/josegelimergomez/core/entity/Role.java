package com.josegelimergomez.core.entity;

import com.josegelimergomez.core.enums.ERole;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_role")
public class Role {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_role", columnDefinition = "BINARY(16)")
    private UUID idRole;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private ERole name;

    @ManyToMany(mappedBy = "roles")
    private Set<Empleados> empleados = new HashSet<>();
}
