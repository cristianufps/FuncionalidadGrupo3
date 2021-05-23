package com.microservicios.funcionalidad.model.service;

import com.microservicios.funcionalidad.model.entity.PermisoEntity;

import java.util.Optional;

public interface IPermisoService {

    public Iterable<PermisoEntity> findAll();

    public Optional<PermisoEntity> findById(Long id);

    public PermisoEntity save(PermisoEntity permit);

    public void deleteById(Long id);

    public void updateById(Long id);
}
