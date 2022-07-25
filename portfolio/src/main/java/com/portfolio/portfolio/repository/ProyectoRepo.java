package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, Long> {
    public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
