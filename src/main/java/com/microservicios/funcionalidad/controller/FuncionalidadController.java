package com.microservicios.funcionalidad.controller;

import com.microservicios.funcionalidad.model.entity.PerfilEntity;
import com.microservicios.funcionalidad.model.service.IFuncionalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/funcionalidad")
@RestController
public class FuncionalidadController {

    @Autowired
    private IFuncionalidadService funcionalidadService;

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
