package com.microservicios.funcionalidad.microserviciofuncionalidad.model.service;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.FuncionalidadEntity;
import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PermisoEntity;

import java.util.Optional;

public interface IFuncionalidadService {

    public Iterable<FuncionalidadEntity> findAll();

    public Optional<FuncionalidadEntity> findById(Long id);

    public FuncionalidadEntity save(FuncionalidadEntity functionality);

    public void deleteById(Long id);

    public void updateById(Long id);
}
