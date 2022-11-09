package com.portfolio.portfolio.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DtoExperiencia implements Serializable {

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
    
}
