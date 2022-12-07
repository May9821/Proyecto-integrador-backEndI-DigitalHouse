package com.proyectointegrador.odontologia.dto.response;

import com.proyectointegrador.odontologia.entity.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OdontologoDtoRes {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer matricula;
    private List<Turno> turnos;
}
