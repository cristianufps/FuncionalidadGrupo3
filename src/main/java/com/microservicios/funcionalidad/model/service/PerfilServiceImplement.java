package com.microservicios.funcionalidad.model.service;

import com.microservicios.funcionalidad.model.entity.PerfilEntity;
import com.microservicios.funcionalidad.model.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
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
