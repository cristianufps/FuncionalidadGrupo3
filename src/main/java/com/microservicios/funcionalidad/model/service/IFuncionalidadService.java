package com.microservicios.funcionalidad.model.service;

import com.microservicios.funcionalidad.model.entity.FuncionalidadEntity;

import java.util.Optional;

public interface IFuncionalidadService {

    Iterable<FuncionalidadEntity> findAll();

    Optional<FuncionalidadEntity> findById(Long id);

    FuncionalidadEntity save(FuncionalidadEntity functionality);

    void deleteById(Long id);

    void updateById(Long id);
}
