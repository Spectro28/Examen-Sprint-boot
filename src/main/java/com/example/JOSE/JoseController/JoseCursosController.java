package com.example.JOSE.JoseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.JOSE.JoseEntity.JoseCursos;
import com.example.JOSE.JoseService.JoseCursosService;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/api/jose-cursos")
public class JoseCursosController {

    @Autowired
    private JoseCursosService service;

    @Operation(summary = "Obtener todos los cursos")
    @GetMapping
    public List<JoseCursos> getAll() {
        return service.findAll();
    }

    @Operation(summary = "Crear un nuevo curso")
    @PostMapping
    public JoseCursos create(@RequestBody JoseCursos joseCursos) {
        return service.save(joseCursos);
    }

    @Operation(summary = "Eliminar un curso por nombre")
    @DeleteMapping("/{nombre}")
    public void deleteByNombre(@PathVariable("nombre") String nombre) {
    service.deleteByNombre(nombre);
}


}

