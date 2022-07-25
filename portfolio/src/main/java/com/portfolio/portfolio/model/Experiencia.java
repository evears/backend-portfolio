package com.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experiencias")
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idExpe")
    private long idExpe;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "descripcionexpe")
    private String descripcionexpe;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "urlfotoempresa")
    private String urlfotoempresa;

    @Column(name = "aniodesde")
    private int aniodesde;

    @Column(name = "aniohasta")
    private int aniohasta;

    public Experiencia() {
    }

    public Experiencia(String puesto, String descripcionexpe, String empresa, String urlfotoempresa, int aniodesde, int aniohasta) {
        this.puesto = puesto;
        this.descripcionexpe = descripcionexpe;
        this.empresa = empresa;
        this.urlfotoempresa = urlfotoempresa;
        this.aniodesde = aniodesde;
        this.aniohasta = aniohasta;
    }

    public long getIdExpe() {
        return idExpe;
    }

    public void setIdExpe(long idExpe) {
        this.idExpe = idExpe;
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
