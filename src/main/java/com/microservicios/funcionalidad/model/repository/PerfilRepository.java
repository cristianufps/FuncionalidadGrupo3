package com.microservicios.funcionalidad.model.repository;

import com.microservicios.funcionalidad.model.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
