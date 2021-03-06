package com.microservicios.funcionalidad.controller;

import com.microservicios.funcionalidad.model.entity.PerfilEntity;
import com.microservicios.funcionalidad.model.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/perfil")
@RestController
public class PerfilController {

    @Autowired
    private IPerfilService perfilService;

    // Insertar
    @PostMapping("/nuevo")
    public ResponseEntity<?> crear (@RequestBody PerfilEntity profile){
        PerfilEntity perfil_bd = perfilService.save(profile);
        return ResponseEntity.status(HttpStatus.CREATED).body(perfil_bd);
    }

    //Listar
    @GetMapping("/listar")
    public ResponseEntity<?> listar () { return ResponseEntity.ok().body(perfilService.findAll()); }

    // Eliminar - PENDIENTE
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
