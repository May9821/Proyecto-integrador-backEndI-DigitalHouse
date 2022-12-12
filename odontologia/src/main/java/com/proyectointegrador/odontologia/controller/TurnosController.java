package com.proyectointegrador.odontologia.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.TurnoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.request.TurnoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.dto.response.TurnoDtoRes;
import com.proyectointegrador.odontologia.entity.Turno;
import com.proyectointegrador.odontologia.service.ITurnoService;
import com.proyectointegrador.odontologia.service.imp.TurnoServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnosController {

    private final ITurnoService turnoService;
    ObjectMapper mapper = new ObjectMapper();
    public TurnosController(TurnoServiceImp turnoService){
        this.turnoService = turnoService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Turno>> findAllTurnos(){
        return new ResponseEntity<>(turnoService.findAllTurnos(), HttpStatus.OK);
    }

    @PostMapping("/crearTurno")
    public ResponseEntity<TurnoDtoRes> crearOdontologo(@RequestBody TurnoDtoReq turnoDtoReq){
        return new ResponseEntity<>(turnoService.createTurno(turnoDtoReq), HttpStatus.CREATED);
    }

    @PutMapping("/updateTurno")
    public ResponseEntity<?> updateTurno(@RequestBody TurnoDtoReq turnoDtoReq){
        turnoService.updateTurno(turnoDtoReq);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @DeleteMapping("/deleteTurno/{id}")
    public ResponseEntity<String> deleteTurno(@PathVariable Long id){
        return new ResponseEntity<>(turnoService.deleteTurno(id),HttpStatus.OK);
    }
}
