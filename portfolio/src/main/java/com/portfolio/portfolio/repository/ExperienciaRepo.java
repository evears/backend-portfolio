package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository <Experiencia, Long> {
    public Optional<Experiencia> findByPuesto(String puesto);
    public boolean existsByPuesto(String puesto);
}
