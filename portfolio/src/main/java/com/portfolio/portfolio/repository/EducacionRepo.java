package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository <Educacion, Long> {
    public Optional<Educacion> findByTitulo(String titulo);
    public boolean existsByTitulo(String titulo);
}
