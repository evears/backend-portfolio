package com.portfolio.portfolio.security.service;

import com.portfolio.portfolio.security.entity.Rol;
import com.portfolio.portfolio.security.enums.RolPersona;
import com.portfolio.portfolio.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolPersona(RolPersona rolPersona){
        return irolRepository.findByRolPersona(rolPersona);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
    
}
