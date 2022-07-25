
package com.portfolio.portfolio.security.repository;

import com.portfolio.portfolio.security.entity.Rol;
import com.portfolio.portfolio.security.enums.RolPersona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    
    Optional<Rol> findByRolPersona(RolPersona rolPersona);
    
}
