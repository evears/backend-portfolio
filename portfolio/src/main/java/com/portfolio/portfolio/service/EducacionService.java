package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Educacion;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.EducacionRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    @Autowired
    EducacionRepo edurepo;

    public List<Educacion> list() {
        return edurepo.findAll();
    }

    public Optional<Educacion> getOne(long id) {
        return edurepo.findById(id);
    }

    public Optional<Educacion> getByTitulo(String titulo) {
        return edurepo.findByTitulo(titulo);
    }

    public void save(Educacion edu) {
        edurepo.save(edu);
    }

    public void delete(long id) {
        edurepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return edurepo.existsById(id);
    }

    public boolean existsByTitulo(String titulo) {
        return edurepo.existsByTitulo(titulo);
    }

}
