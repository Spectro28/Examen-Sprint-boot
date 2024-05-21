package com.example.JOSE.JoseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.JOSE.JoseEntity.JoseStudent;
import com.example.JOSE.JoseService.JoseStudentService;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/api/jose-students")
public class JoseStudentController {

    @Autowired
    private JoseStudentService service;

    @Operation(summary = "Obtener todos los estudiantes")
    @GetMapping
    public List<JoseStudent> getAll() {
        return service.findAll();
    }

    @Operation(summary = "Crear un nuevo estudiante")
    @PostMapping
    public JoseStudent create(@RequestBody JoseStudent joseStudent) {
        return service.save(joseStudent);
    }

    @Operation(summary = "Eliminar un estudiante por nombre")
    @DeleteMapping("/{name}")
    public void deleteByName(@Parameter(description = "Nombre del estudiante a eliminar") @PathVariable("name") String name) {
        service.deleteByName(name);
    }
}
