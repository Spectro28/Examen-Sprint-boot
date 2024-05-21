package com.example.JOSE.JoseEntity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "JoseCursos")
public class JoseCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private Integer precio;
    private LocalDate inscripciones;
    private Boolean activo;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private JoseStudent joseStudent;
}
