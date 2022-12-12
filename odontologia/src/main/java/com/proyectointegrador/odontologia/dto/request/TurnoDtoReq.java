package com.proyectointegrador.odontologia.dto.request;

import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.PacienteDto;
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
public class TurnoDtoReq {
    private Long id;
    private PacienteDto paciente;
    private OdontologoDto odontologo;
    private Date fecha;
}
