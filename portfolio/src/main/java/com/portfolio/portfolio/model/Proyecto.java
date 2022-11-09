package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyectos")
@Getter @Setter @NoArgsConstructor
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idproye")
    private long idproye;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="url")
    private String url;
    
    @Column(name="anio")
    private int anio;

    public Proyecto(String nombre, String descripcion, String url, int anio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.anio = anio;
    }

}
