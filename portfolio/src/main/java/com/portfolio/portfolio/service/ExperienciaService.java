package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.ExperienciaRepo;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepo expeRepo;

    public List<Experiencia> list() {
        return expeRepo.findAll();
    }

    public Optional<Experiencia> getOne(long id) {
        return expeRepo.findById(id);
    }

    public Optional<Experiencia> getByPuesto(String puesto) {
        return expeRepo.findByPuesto(puesto);
    }

    public void save(Experiencia expe) {
        expeRepo.save(expe);
    }

    public void delete(long id) {
        expeRepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return expeRepo.existsById(id);
    }

    public boolean existsByPuesto(String puesto) {
        return expeRepo.existsByPuesto(puesto);
    }

}
