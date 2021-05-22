package com.microservicios.funcionalidad.microserviciofuncionalidad.model.service;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PerfilEntity;

import java.util.Optional;

public interface IPerfilService {

    public Iterable<PerfilEntity> findAll();

    public Optional<PerfilEntity> findById(Long id);

    public PerfilEntity save(PerfilEntity profile);

    public void deleteById(Long id);

    public void updateById(PerfilEntity id);
}
