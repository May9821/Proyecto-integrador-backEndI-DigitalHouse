package com.proyectointegrador.odontologia.service.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.dto.TurnoDto;
import com.proyectointegrador.odontologia.dto.request.TurnoDtoReq;
import com.proyectointegrador.odontologia.dto.response.TurnoDtoRes;
import com.proyectointegrador.odontologia.entity.Turno;
import com.proyectointegrador.odontologia.repository.ITurnoRepository;
import com.proyectointegrador.odontologia.service.ITurnoService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TurnoServiceImp implements ITurnoService {

    private static final Logger LOGGER = Logger.getLogger(PacienteServiceImp.class);
    private final ITurnoRepository turnoRepository;

    ObjectMapper mapper = new ObjectMapper();

    public TurnoServiceImp(ITurnoRepository turnoRepository){
        this.turnoRepository = turnoRepository;

    }

    @Override
    public List<Turno> findAllTurnos() {
        /*List<Turno> listaTurnos = turnoRepository.findAll();
        List<TurnoDto> turnoDto = listaTurnos.stream()
                .map(turno -> mapper.convertValue(turno, TurnoDto.class))
                .collect(Collectors.toList());
        return turnoDto;*/

        return turnoRepository.findAllTurnos2();
    }

    @Override
    public TurnoDtoRes createTurno(TurnoDtoReq turnoDtoReq) {
        Turno turno = mapper.convertValue(turnoDtoReq, Turno.class);
        turnoRepository.save(turno);

        TurnoDtoRes respuesta = new TurnoDtoRes();
        LOGGER.info("Turno creado con éxito");
        respuesta.setTurno(mapper.convertValue(turno,TurnoDto.class));
        respuesta.setMensaje("Turno creado exitosamente con id: "+turno.getId());

        return respuesta;
    }

    @Override
    public String updateTurno(TurnoDtoReq turnoDtoReq) {
        Turno turno = mapper.convertValue(turnoDtoReq, Turno.class);
        turnoRepository.save(turno);
        LOGGER.info("Turno actualizado con éxito");

        return "Turno actualizado con éxito";
    }

    @Override
    public String deleteTurno(Long id) {
        if (turnoRepository.findById(id).isPresent()){
            turnoRepository.deleteById(id);
            LOGGER.info("Turno eliminado con éxito");

            return "El turno con id: "+id+" ha sido borrado de forma exitosa";
        }
        LOGGER.error("Turno no existe en la base de datos");
        return "El turno con id: "+id+" no existe en la BD";
    }
}
