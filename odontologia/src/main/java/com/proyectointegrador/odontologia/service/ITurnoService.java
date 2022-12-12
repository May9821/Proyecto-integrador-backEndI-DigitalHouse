package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.TurnoDto;
import com.proyectointegrador.odontologia.dto.request.TurnoDtoReq;
import com.proyectointegrador.odontologia.dto.response.TurnoDtoRes;
import com.proyectointegrador.odontologia.entity.Turno;

import java.util.List;

public interface ITurnoService {
    List<Turno> findAllTurnos();
    TurnoDtoRes createTurno(TurnoDtoReq turnoDtoReq);
    String updateTurno(TurnoDtoReq turno);
    String deleteTurno(Long id);

}
