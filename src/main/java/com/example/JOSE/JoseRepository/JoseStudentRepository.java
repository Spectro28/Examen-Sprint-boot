package com.example.JOSE.JoseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JOSE.JoseEntity.JoseStudent;

public interface JoseStudentRepository extends JpaRepository<JoseStudent, Long> {
    JoseStudent findByName(String name);
}
