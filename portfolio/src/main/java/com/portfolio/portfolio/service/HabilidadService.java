package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.HabilidadRepo;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabilidadService {

    @Autowired
    HabilidadRepo habirepo;

    public List<Habilidad> list() {
        return habirepo.findAll();
    }

    public Optional<Habilidad> getOne(long id) {
        return habirepo.findById(id);
    }

    public Optional<Habilidad> getByNombre(String nombre) {
        return habirepo.findByNombre(nombre);
    }

    public void save(Habilidad habi) {
        habirepo.save(habi);
    }

    public void delete(long id) {
        habirepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return habirepo.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return habirepo.existsByNombre(nombre);
    }
}
