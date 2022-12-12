package com.proyectointegrador.odontologia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.entity.Paciente;
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
public class TurnoDto {
    private Long id;
    private PacienteDto paciente;
    private OdontologoDto odontologo;
    private Date fecha;
}
