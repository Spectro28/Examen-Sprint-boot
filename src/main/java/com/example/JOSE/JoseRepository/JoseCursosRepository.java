package com.example.JOSE.JoseRepository;

import com.example.JOSE.JoseEntity.JoseCursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoseCursosRepository extends JpaRepository<JoseCursos, Long> {
    void deleteByNombre(String nombre);
    
    JoseCursos findByNombre(String nombre);
}
