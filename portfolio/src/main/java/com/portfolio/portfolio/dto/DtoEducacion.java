package com.portfolio.portfolio.dto;

import javax.validation.constraints.NotBlank;

public class DtoEducacion {

    @NotBlank
    private long idedu;

    @NotBlank
    private String instituto;

    @NotBlank
    private String titulo;

    @NotBlank
    private String urllogoedu;

    @NotBlank
    private int aniodesde;

    @NotBlank
    private int aniohasta;

    public DtoEducacion() {
    }

    public DtoEducacion(String instituto, String titulo, String urllogoedu, int aniodesde, int aniohasta) {
        this.instituto = instituto;
        this.titulo = titulo;
        this.urllogoedu = urllogoedu;
        this.aniodesde = aniodesde;
        this.aniohasta = aniohasta;
    }

    public long getIdedu() {
        return idedu;
    }

    public void setIdedu(long idedu) {
        this.idedu = idedu;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrllogoedu() {
        return urllogoedu;
    }

    public void setUrllogoedu(String urllogoedu) {
        this.urllogoedu = urllogoedu;
    }

    public int getAniodesde() {
        return aniodesde;
    }

    public void setAniodesde(int aniodesde) {
        this.aniodesde = aniodesde;
    }

    public int getAniohasta() {
        return aniohasta;
    }

    public void setAniohasta(int aniohasta) {
        this.aniohasta = aniohasta;
    }
    
    
}
