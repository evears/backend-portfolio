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
@Table(name = "habilidades")
@Getter @Setter @NoArgsConstructor
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idhab")
    private long idhab;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "porcentaje")
    private int porcentaje;

    public Habilidad(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

}
