package com.proyectointegrador.odontologia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proyectointegrador.odontologia.entity.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OdontologoDto {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer matricula;
    private List<Turno> turnos;

}
