package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;

import java.util.List;

public interface IPacienteService {
    List<PacienteDtoRes> findAllPacientes();
    Paciente findPacienteById(Long Id);
    Paciente createPaciente(PacienteDtoReq pacienteDtoReq);
    String deletePaciente(Long id);
    String updatePaciente(Paciente paciente);
}
