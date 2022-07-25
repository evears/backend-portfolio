package com.portfolio.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educaciones")
public class Educacion implements Serializable {
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ideducacion")
    private long idedu;
    
    @Column(name="instituto")
    private String instituto;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="urllogoedu")
    private String urllogoedu;
    
    @Column(name="aniodesde")
    private int aniodesde;
    
    @Column(name="aniohasta")
    private int aniohasta;

    public Educacion() {
    }

    public Educacion(String instituto, String titulo, String urllogoedu, int aniodesde, int aniohasta) {
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
