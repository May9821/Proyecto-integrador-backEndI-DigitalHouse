package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.exception.ResourceNotFoundException;

import java.util.List;

public interface IPacienteService {
    List<PacienteDto> findAllPacientes();
    PacienteDto findPacienteById2(Long Id);
    PacienteDtoRes createPaciente(PacienteDtoReq pacienteDtoReq);
    String deletePaciente(Long id) throws ResourceNotFoundException;
    String updatePaciente(PacienteDtoReq pacienteDtoReq);
}
