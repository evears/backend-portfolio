package com.portfolio.portfolio.dto;

import javax.validation.constraints.NotBlank;

public class DtoExperiencia {

    @NotBlank
    private String puesto;
    @NotBlank
    private String descripcionexpe;
    @NotBlank
    private String empresa;
    @NotBlank
    private String urlfotoempresa;
    @NotBlank
    private int aniodesde;
    @NotBlank
    private int aniohasta;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String puesto, String descripcionexpe, String empresa, String urlfotoempresa, int aniodesde, int aniohasta) {
        this.puesto = puesto;
        this.descripcionexpe = descripcionexpe;
        this.empresa = empresa;
        this.urlfotoempresa = urlfotoempresa;
        this.aniodesde = aniodesde;
        this.aniohasta = aniohasta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcionexpe() {
        return descripcionexpe;
    }

    public void setDescripcionexpe(String descripcionexpe) {
        this.descripcionexpe = descripcionexpe;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUrlfotoempresa() {
        return urlfotoempresa;
    }

    public void setUrlfotoempresa(String urlfotoempresa) {
        this.urlfotoempresa = urlfotoempresa;
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
