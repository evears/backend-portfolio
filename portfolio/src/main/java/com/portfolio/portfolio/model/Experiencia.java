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
@Table(name = "experiencias")
@Getter @Setter @NoArgsConstructor
public class Experiencia {

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

    public Experiencia(String puesto, String descripcionexpe, String empresa, String urlfotoempresa, int aniodesde, int aniohasta) {
        this.puesto = puesto;
        this.descripcionexpe = descripcionexpe;
        this.empresa = empresa;
        this.urlfotoempresa = urlfotoempresa;
        this.aniodesde = aniodesde;
        this.aniohasta = aniohasta;
    }

}
