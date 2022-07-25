
package com.portfolio.portfolio.security.entity;

import com.portfolio.portfolio.security.enums.RolPersona;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolPersona rolPersona;

    public Rol() {
    }

    public Rol(int id, RolPersona rolPersona) {
        this.rolPersona = rolPersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolPersona getRolPersona() {
        return rolPersona;
    }

    public void setRolPersona(RolPersona rolPersona) {
        this.rolPersona = rolPersona;
    }
    
    
    
}
