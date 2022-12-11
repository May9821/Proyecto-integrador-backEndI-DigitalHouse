package com.proyectointegrador.odontologia.controller;


import com.proyectointegrador.odontologia.dto.PacienteDto;
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
    public ResponseEntity<List<PacienteDto>> findALlPacientes(){
        return new ResponseEntity<>(pacienteService.findAllPacientes(),HttpStatus.OK);
    }

    @PostMapping("/crearPaciente")
    public ResponseEntity<PacienteDtoRes> crearPaciente(@RequestBody PacienteDtoReq pacienteDtoReq){
        return new ResponseEntity<>(pacienteService.createPaciente(pacienteDtoReq), HttpStatus.CREATED);
    }

    @PutMapping("/updatePaciente")
    public ResponseEntity<?> updatePaciente (@RequestBody PacienteDtoReq pacienteDtoReq){
        pacienteService.updatePaciente(pacienteDtoReq);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/deletePaciente/{id}")
    public ResponseEntity<String> deletePaciente(@PathVariable Long id){
        return  new ResponseEntity<>(pacienteService.deletePaciente(id),HttpStatus.OK);
    }






}
