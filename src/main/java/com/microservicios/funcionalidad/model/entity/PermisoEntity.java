package com.microservicios.funcionalidad.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name="permises")
public class PermisoEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long funcionalidad_id;

    @NotNull
    private Long perfil_id;

    public PermisoEntity () {}

    public PermisoEntity (Long id, Long funcionalidad_id, Long perfil_id) {
        this.id = id;
        this.funcionalidad_id = funcionalidad_id;
        this.perfil_id = perfil_id;
    }
}
