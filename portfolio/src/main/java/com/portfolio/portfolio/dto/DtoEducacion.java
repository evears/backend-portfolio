package com.portfolio.portfolio.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DtoEducacion implements Serializable {

    @NotBlank
    private String instituto;

    @NotBlank
    private String titulo;

    @NotBlank
    private String urllogoedu;

    @NotBlank
    private int aniodesde;

    @NotBlank
    private int aniohasta;
    
}
