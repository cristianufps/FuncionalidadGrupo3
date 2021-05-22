package com.microservicios.funcionalidad.microserviciofuncionalidad.controller;

import com.microservicios.funcionalidad.microserviciofuncionalidad.model.entity.PerfilEntity;
import com.microservicios.funcionalidad.microserviciofuncionalidad.model.service.IPermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PermisoController {

    @Autowired
    private IPermisoService permiso_serv;

    // Insertar
    @PostMapping("/nuevo")
    public ResponseEntity<?> crear (@RequestBody PerfilEntity perfil){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //Listar
    @GetMapping("/listar")
    public ResponseEntity<?> listar () { return ResponseEntity.ok().build(); }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar (@PathVariable String identificador) {
        return ResponseEntity.ok().build();
    }

    // Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar (@PathVariable String identificador) {
        return ResponseEntity.ok().build();
    }

    // Buscar
    @GetMapping("/{id}")
    public ResponseEntity<?> buscar (@PathVariable String identificador) {
        return ResponseEntity.ok().build();
    }
}
