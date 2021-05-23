package com.microservicios.funcionalidad.model.repository;

import com.microservicios.funcionalidad.model.entity.FuncionalidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionalidadRepository extends JpaRepository<FuncionalidadEntity, Long> {

}
