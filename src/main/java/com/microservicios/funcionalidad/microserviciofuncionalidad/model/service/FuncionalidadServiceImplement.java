package com.microservicios.funcionalidad.microserviciofuncionalidad.model.service;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.FuncionalidadEntity;
import com.microservicios.funcionalidad.microserviciofuncionalidad.model.repository.FuncionalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FuncionalidadServiceImplement implements IFuncionalidadService {

    @Autowired
    private FuncionalidadRepository repository;

    @Override
    public Iterable<FuncionalidadEntity> findAll() {
        return null;
    }

    @Override
    public Optional<FuncionalidadEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public FuncionalidadEntity save(FuncionalidadEntity functionality) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void updateById(Long id) {

    }
}
