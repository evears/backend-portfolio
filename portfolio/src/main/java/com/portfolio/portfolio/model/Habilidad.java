package com.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "habilidades")
public class Habilidad implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idhabilidad")
    private long idhab;
    
    @Column(name="nombrehabilidad")
    private String nombre;
    
    @Column(name="porcentaje")
    private int porcentaje;

    public Habilidad() {
    }

    public Habilidad(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public long getIdhab() {
        return idhab;
    }

    public void setIdhab(long idhab) {
        this.idhab = idhab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}
