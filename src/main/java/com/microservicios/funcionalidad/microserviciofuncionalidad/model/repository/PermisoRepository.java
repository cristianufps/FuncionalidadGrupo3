package com.microservicios.funcionalidad.microserviciofuncionalidad.model.repository;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PermisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<PermisoEntity, Long> {
}
