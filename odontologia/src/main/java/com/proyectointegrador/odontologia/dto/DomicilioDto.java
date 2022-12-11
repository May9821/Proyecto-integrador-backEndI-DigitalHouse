package com.proyectointegrador.odontologia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomicilioDto {
    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

}
