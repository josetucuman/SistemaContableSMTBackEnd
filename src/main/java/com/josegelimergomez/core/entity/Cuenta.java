package com.josegelimergomez.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

@Builder
@Entity
@Table(name = "tbl_cuenta")
public class Cuenta implements Serializable {


    private static final long serialVersionUID = -2197231302792167820L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cuenta", nullable = false)
    private Long id;
    @Column(name = "cuen_codigo")
    private String codigo;
    @Column(name = "desc")
    private String descripcion;
}
