package com.microservicios.funcionalidad.microserviciofuncionalidad.model.service;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PerfilEntity;
import com.microservicios.funcionalidad.microserviciofuncionalidad.model.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PerfilServiceImplement implements IPerfilService {

    @Autowired
    private PerfilRepository repository;

    @Override
    public Iterable<PerfilEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PerfilEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public PerfilEntity save(PerfilEntity profile) {
        return repository.save(profile);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateById(PerfilEntity profile) {
        repository.save(profile);
    }
}
