package com.example.JOSE.JoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JOSE.JoseEntity.JoseCursos;
import com.example.JOSE.JoseRepository.JoseCursosRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class JoseCursosService {

    @Autowired
    private JoseCursosRepository repository;

    public List<JoseCursos> findAll() {
        return repository.findAll();
    }

    public JoseCursos save(JoseCursos joseCursos) {
        return repository.save(joseCursos);
    }

    public void deleteByNombre(String nombre) {
    JoseCursos curso = repository.findByNombre(nombre);
    if (curso != null) {
        repository.delete(curso);
    } else {
        throw new EntityNotFoundException("Curso no encontrado con el nombre: " + nombre);
    }
  }

}
