package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter @Setter @NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpersona")
    private long idpersona;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Column(name = "titulo")
    private String titulo;

    @NotNull
    @Column(name = "infopersonal")
    private String infopersonal;

    @NotNull
    @Column(name = "urlfotoperfil")
    private String urlfotoperfil;

    public Persona(String nombre, String apellido, String titulo, String infopersonal, String urlfotoperfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.infopersonal = infopersonal;
        this.urlfotoperfil = urlfotoperfil;
    }

}
