package com.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idproyecto")
    private long idproye;
    
    @Column(name="nombreproyecto")
    private String nombre;
    
    @Column(name="descripcionproyecto")
    private String descripcion;
    
    @Column(name="urlproyecto")
    private String url;
    
    @Column(name="anioproyecto")
    private int anio;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String url, int anio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.anio = anio;
    }

    public long getIdproye() {
        return idproye;
    }

    public void setIdproye(long idproye) {
        this.idproye = idproye;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
