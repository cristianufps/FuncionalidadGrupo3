package com.microservicios.funcionalidad.model.service;

import com.microservicios.funcionalidad.model.entity.PermisoEntity;
import com.microservicios.funcionalidad.model.repository.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PermisoServiceImplement implements IPermisoService {

    @Autowired
    private PermisoRepository repository;

    @Override
    public Iterable<PermisoEntity> findAll() {
        return null;
    }

    @Override
    public Optional<PermisoEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public PermisoEntity save(PermisoEntity permit) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void updateById(Long id) {

    }
}
