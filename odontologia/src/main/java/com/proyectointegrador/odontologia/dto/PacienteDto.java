package com.proyectointegrador.odontologia.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaIngreso;
    private DomicilioDto domicilio;
}
