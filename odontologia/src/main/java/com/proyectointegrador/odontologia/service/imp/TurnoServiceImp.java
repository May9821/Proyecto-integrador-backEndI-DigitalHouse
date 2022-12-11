package com.proyectointegrador.odontologia.service.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.repository.ITurnoRepository;
import com.proyectointegrador.odontologia.service.ITurnoService;
import org.springframework.stereotype.Service;

@Service
public class TurnoServiceImp implements ITurnoService {

    private final ITurnoRepository turnoRepository;

    ObjectMapper mapper = new ObjectMapper();

    public TurnoServiceImp(ITurnoRepository turnoRepository){
        this.turnoRepository = turnoRepository;

    }

}
