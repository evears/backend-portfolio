package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository <Persona, Long> {
    public Optional<Persona> findById(long id);
    public boolean existsById(long id);
}
