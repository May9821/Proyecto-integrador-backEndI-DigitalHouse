package com.proyectointegrador.odontologia.dto.response;

import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.entity.Domicilio;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.entity.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PacienteDtoRes {
    private Paciente paciente;
    private String mensaje;
}
