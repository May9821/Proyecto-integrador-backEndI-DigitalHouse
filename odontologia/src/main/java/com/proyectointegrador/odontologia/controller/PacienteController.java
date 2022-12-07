package com.proyectointegrador.odontologia.controller;


import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.service.IPacienteService;
import com.proyectointegrador.odontologia.service.imp.PacienteServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final IPacienteService pacienteService;

    public PacienteController(PacienteServiceImp pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<PacienteDtoRes>> findALlPacientes(){
        return new ResponseEntity<>(pacienteService.findAllPacientes(),HttpStatus.OK);
    }

    @PostMapping("/crearPaciente")
    public ResponseEntity<String> crearPaciente(@RequestBody PacienteDtoReq pacienteDtoReq){
        pacienteService.createPaciente(pacienteDtoReq);
        return new ResponseEntity<>("Paciente creado con éxito", HttpStatus.CREATED);
    }

    @DeleteMapping("/deletePaciente/{id}")
    public ResponseEntity<String> deletePaciente(@PathVariable Long id){
        return  new ResponseEntity<>("El paciente se ha eliminado de forma exitosa",HttpStatus.OK);
    }






}
