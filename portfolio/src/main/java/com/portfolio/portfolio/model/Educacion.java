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
@Table(name = "educaciones")
@Getter @Setter @NoArgsConstructor
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idedu")
    private long idedu;

    @Column(name = "instituto")
    private String instituto;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "urllogoedu")
    private String urllogoedu;

    @Column(name = "aniodesde")
    private int aniodesde;

    @Column(name = "aniohasta")
    private int aniohasta;

    public Educacion(String instituto, String titulo, String urllogoedu, int aniodesde, int aniohasta) {
        this.instituto = instituto;
        this.titulo = titulo;
        this.urllogoedu = urllogoedu;
        this.aniodesde = aniodesde;
        this.aniohasta = aniohasta;
    }

}
