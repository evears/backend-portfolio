package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.ProyectoRepo;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepo proyerepo;

    public List<Proyecto> list() {
        return proyerepo.findAll();
    }

    public Optional<Proyecto> getOne(long id) {
        return proyerepo.findById(id);
    }

    public Optional<Proyecto> getByNombre(String nombre) {
        return proyerepo.findByNombre(nombre);
    }

    public void save(Proyecto proye) {
        proyerepo.save(proye);
    }

    public void delete(long id) {
        proyerepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return proyerepo.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return proyerepo.existsByNombre(nombre);
    }

}
