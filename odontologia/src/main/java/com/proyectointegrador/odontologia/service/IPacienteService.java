package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;

import java.util.List;

public interface IPacienteService {
    List<PacienteDto> findAllPacientes();
    Paciente findPacienteById(Long Id);
    PacienteDtoRes createPaciente(PacienteDtoReq pacienteDtoReq);
    String deletePaciente(Long id);
    String updatePaciente(PacienteDtoReq pacienteDtoReq);
}
