package com.proyectointegrador.odontologia.dto.response;

import com.proyectointegrador.odontologia.dto.TurnoDto;
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
public class TurnoDtoRes {
    private TurnoDto turno;
    private String mensaje;

}
