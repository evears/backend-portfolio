package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.dto.DtoHabilidad;
import com.portfolio.portfolio.model.Habilidad;
import com.portfolio.portfolio.security.controller.Mensaje;
import com.portfolio.portfolio.service.HabilidadService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
    
    @Autowired
    private HabilidadService habservice;

    @GetMapping("/habilidad/vertodos")
    public ResponseEntity<List<Habilidad>> list() {
        List<Habilidad> list = habservice.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/habilidad/ver/{id}")
    public ResponseEntity<Habilidad> getById(@PathVariable("id") long id) {
        if (!habservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Habilidad hab = habservice.getOne(id).get();
        return new ResponseEntity(hab, HttpStatus.OK);
    }
    
    @DeleteMapping("/habilidad/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (!habservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        habservice.delete(id);
        return new ResponseEntity(new Mensaje("se eliminó correctamente"), HttpStatus.OK);
    }
    
    @PostMapping("/habilidad/crear")
    public ResponseEntity<?> create(@RequestBody DtoHabilidad dtohab) {
        if (StringUtils.isBlank(dtohab.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (habservice.existsByNombre(dtohab.getNombre())) {
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);
        }

        Habilidad hab = new Habilidad(dtohab.getNombre(), dtohab.getPorcentaje());
        habservice.save(hab);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/habilidad/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody DtoHabilidad dtohab) {
        
        if (!habservice.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (habservice.existsByNombre(dtohab.getNombre()) && habservice.getByNombre(dtohab.getNombre()).get().getIdhab()!= id) {
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (StringUtils.isBlank(dtohab.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre de la habilidad es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Habilidad hab = habservice.getOne(id).get();
        hab.setNombre(dtohab.getNombre());
        hab.setPorcentaje(dtohab.getPorcentaje());
        
        habservice.save(hab);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);

    }
    
    
}
