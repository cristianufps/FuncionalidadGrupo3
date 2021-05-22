package com.microservicios.funcionalidad.microserviciofuncionalidad.model.repository;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
