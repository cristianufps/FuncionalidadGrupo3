package com.microservicios.funcionalidad.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@Table(name="profiles")
public class PerfilEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String descripcion;

    public PerfilEntity () {}

    public PerfilEntity (Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
}
