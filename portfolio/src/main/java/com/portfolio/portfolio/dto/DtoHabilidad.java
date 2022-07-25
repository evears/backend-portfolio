package com.portfolio.portfolio.dto;

import javax.validation.constraints.NotBlank;

public class DtoHabilidad {
    
    @NotBlank
    private long idhab;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private int porcentaje;

    public DtoHabilidad() {
    }

    public DtoHabilidad(String nombre, int porcentaje) {
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
