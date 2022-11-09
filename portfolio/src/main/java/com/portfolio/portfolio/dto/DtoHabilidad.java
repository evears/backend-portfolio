package com.portfolio.portfolio.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DtoHabilidad implements Serializable {

    @NotBlank
    private String nombre;
    
    @NotBlank
    private int porcentaje;

}
