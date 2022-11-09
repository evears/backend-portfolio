package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.PersonaRepo;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {

    @Autowired 
    PersonaRepo persorepo;
    
    public List<Persona> list() {
        return persorepo.findAll();
    }
    
    public Optional<Persona> getOne(long id) {
        return persorepo.findById(id);
    }

    public void save(Persona persona) {
        persorepo.save(persona);
    }

    public void delete(long id) {
        persorepo.deleteById(id);
    }
    
    public boolean existsById(long id) {
        return persorepo.existsById(id);
    }
}
