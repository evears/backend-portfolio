package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.dto.DtoExperiencia;
import com.portfolio.portfolio.model.Experiencia;
import com.portfolio.portfolio.security.controller.Mensaje;
import com.portfolio.portfolio.service.ExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExperienciaController {

    @Autowired
    private ExperienciaService expeservice;

    @GetMapping("/experiencia/vertodos")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> list = expeservice.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/experiencia/ver/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") long id) {
        if (!expeservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Experiencia experiencia = expeservice.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    @DeleteMapping("/experiencia/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (!expeservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        expeservice.delete(id);
        return new ResponseEntity(new Mensaje("se eliminó correctamente"), HttpStatus.OK);
    }

    @PostMapping("/experiencia/crear")
    public ResponseEntity<?> create(@RequestBody DtoExperiencia dtoexp) {
        if (StringUtils.isBlank(dtoexp.getPuesto())) {
            return new ResponseEntity(new Mensaje("El nombre del puesto es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (expeservice.existsByPuesto(dtoexp.getPuesto())) {
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = new Experiencia(dtoexp.getPuesto(), dtoexp.getDescripcionexpe(), dtoexp.getEmpresa(),
                                    dtoexp.getUrlfotoempresa(), dtoexp.getAniodesde(), dtoexp.getAniohasta());
        expeservice.save(experiencia);

        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }

    @PutMapping("/experiencia/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody DtoExperiencia dtoexp) {
        
        if (!expeservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (expeservice.existsByPuesto(dtoexp.getPuesto()) && expeservice.getByPuesto(dtoexp.getPuesto()).get().getIdExpe() != id) {
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (StringUtils.isBlank(dtoexp.getPuesto())) {
            return new ResponseEntity(new Mensaje("El nombre del puesto es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = expeservice.getOne(id).get();
        experiencia.setPuesto(dtoexp.getPuesto());
        experiencia.setDescripcionexpe(dtoexp.getDescripcionexpe());
        experiencia.setEmpresa(dtoexp.getEmpresa());
        experiencia.setUrlfotoempresa(dtoexp.getUrlfotoempresa());
        experiencia.setAniodesde(dtoexp.getAniodesde());
        experiencia.setAniohasta(dtoexp.getAniohasta());

        expeservice.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);

    }

}
