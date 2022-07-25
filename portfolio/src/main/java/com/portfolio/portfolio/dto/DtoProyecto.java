package com.portfolio.portfolio.dto;

import javax.validation.constraints.NotBlank;

public class DtoProyecto {
    
    @NotBlank
    private long idproye;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String url;
    
    @NotBlank
    private int anio;

    public DtoProyecto() {
    }

    public DtoProyecto(String nombre, String descripcion, String url, int anio) {
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
