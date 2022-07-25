package com.portfolio.portfolio.security.service;

import com.portfolio.portfolio.security.entity.Usuario;
import com.portfolio.portfolio.security.repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByUsername(String username){
        return iusuarioRepository.findByUsername(username);
    }
    
    public boolean existsByUsername(String username){
        return iusuarioRepository.existsByUsername(username);
    }
    
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
    
}
