package com.proyectointegrador.odontologia.service.imp;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.exception.ResourceNotFoundException;
import com.proyectointegrador.odontologia.repository.IPacienteRepository;
import com.proyectointegrador.odontologia.service.IPacienteService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteServiceImp implements IPacienteService {

    private static final Logger LOGGER = Logger.getLogger(PacienteServiceImp.class);
    private final IPacienteRepository pacienteRepository;

    ObjectMapper mapper = new ObjectMapper();
    public PacienteServiceImp(IPacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<PacienteDto> findAllPacientes() {
        List<Paciente>  listaPacientes = pacienteRepository.findAll();
        List<PacienteDto> pacienteDto = listaPacientes.stream()
                .map(paciente -> mapper.convertValue(paciente, PacienteDto.class))
                .collect(Collectors.toList());
        return pacienteDto;
    }

//    @Override
//    public Paciente findPacienteById(Long Id) {
//        return null;
//    }
    @Override
    public PacienteDto findPacienteById2(Long id ){
        Paciente paciente = pacienteRepository.findPacienteById(id);
        PacienteDto pacienteDto = null;
        if (paciente.getId() == null){
            LOGGER.error("no existe el paciente");
            throw new RuntimeException("no se encuentra paciente");
        }else {
            LOGGER.info("Paciente encontrado");
            pacienteDto = mapper.convertValue(paciente,PacienteDto.class);
        }
        return pacienteDto;
    }

    @Override
    public PacienteDtoRes createPaciente(PacienteDtoReq pacienteDtoReq) {
        Paciente paciente = mapper.convertValue(pacienteDtoReq, Paciente.class);
        pacienteRepository.save(paciente);

        PacienteDtoRes respuesta = new PacienteDtoRes();
        respuesta.setPaciente(paciente);
        respuesta.setMensaje("Paciente creado exitosamente con id "+paciente.getId());
        LOGGER.info("Paciente creado exitosamente");
        return respuesta;
    }

    @Override
    public String deletePaciente(Long id) throws ResourceNotFoundException {
        if (pacienteRepository.findById(id).isPresent()){
            pacienteRepository.deleteById(id);
            LOGGER.info("Paciente ha sido borrado de forma exitosa");
            return "El paciente con el id: "+ id+" ha sido borrado de forma exitosa";
        }
        LOGGER.error("Paciente no existe en la BD");
        throw new ResourceNotFoundException( "El paciente con el id: "+id+ " no existe en la BD");
    }

    @Override
    public String updatePaciente(PacienteDtoReq pacienteDtoReq) {
        Paciente paciente = mapper.convertValue(pacienteDtoReq, Paciente.class);
        pacienteRepository.save(paciente);
        LOGGER.info("Paciente ha sido actualizado de forma exitosa");

        return "Paciente actualizado";
    }
}
