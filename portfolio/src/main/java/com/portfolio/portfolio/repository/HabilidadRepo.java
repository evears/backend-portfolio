package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Habilidad;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepo extends JpaRepository <Habilidad, Long> {
    public Optional<Habilidad> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
