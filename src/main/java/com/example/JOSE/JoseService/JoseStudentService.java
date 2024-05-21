package com.example.JOSE.JoseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JOSE.JoseEntity.JoseStudent;
import com.example.JOSE.JoseRepository.JoseStudentRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class JoseStudentService {

    @Autowired
    private JoseStudentRepository repository;

    public List<JoseStudent> findAll() {
        return repository.findAll();
    }

    public JoseStudent save(JoseStudent joseStudent) {
        return repository.save(joseStudent);
    }

    public void deleteByName(String name) {
        JoseStudent student = repository.findByName(name);
        if (student != null) {
            repository.delete(student);
        } else {
            throw new EntityNotFoundException("Estudiante no encontrado con el nombre: " + name);
        }
    }
}
