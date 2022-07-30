package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.dto.DtoProyecto;
import com.portfolio.portfolio.model.Proyecto;
import com.portfolio.portfolio.security.controller.Mensaje;
import com.portfolio.portfolio.service.ProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private ProyectoService proyeserv;

    @GetMapping("/proyecto/vertodos")
    public ResponseEntity<List<Proyecto>> list() {
        List<Proyecto> list = proyeserv.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/proyecto/ver/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") long id) {
        if (!proyeserv.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proyecto proye = proyeserv.getOne(id).get();
        return new ResponseEntity(proye, HttpStatus.OK);
    }
    
    @DeleteMapping("/proyecto/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (!proyeserv.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        proyeserv.delete(id);
        return new ResponseEntity(new Mensaje("se eliminó correctamente"), HttpStatus.OK);
    }
    
    @PostMapping("/proyecto/crear")
    public ResponseEntity<?> create(@RequestBody DtoProyecto dtoproye) {
        if (StringUtils.isBlank(dtoproye.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre del pproyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (proyeserv.existsByNombre(dtoproye.getNombre())) {
            return new ResponseEntity(new Mensaje("Ese proyecto existe"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proye = new Proyecto(dtoproye.getNombre(), dtoproye.getDescripcion(), dtoproye.getUrl(), dtoproye.getAnio());
        proyeserv.save(proye);

        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody DtoProyecto dtoproye) {
        
        if (!proyeserv.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (proyeserv.existsByNombre(dtoproye.getNombre()) && proyeserv.getByNombre(dtoproye.getNombre()).get().getIdproye()!= id) {
            return new ResponseEntity(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        if (StringUtils.isBlank(dtoproye.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre del proyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proye = proyeserv.getOne(id).get();
        proye.setNombre(dtoproye.getNombre());
        proye.setDescripcion(dtoproye.getDescripcion());
        proye.setUrl(dtoproye.getUrl());
        proye.setAnio(dtoproye.getAnio());
        
        proyeserv.save(proye);
        return new ResponseEntity(new Mensaje("Proyecto actualizada"), HttpStatus.OK);

    }
    
    
}
