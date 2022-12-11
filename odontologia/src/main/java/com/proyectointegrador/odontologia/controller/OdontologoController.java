package com.proyectointegrador.odontologia.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.service.IOdontologoService;
import com.proyectointegrador.odontologia.service.imp.OdontologoServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private final IOdontologoService odontologoService ;
    ObjectMapper mapper = new ObjectMapper();

    public OdontologoController(OdontologoServiceImp odontologoService){
        this.odontologoService = odontologoService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<OdontologoDto>> findAllOdontologos(){
        return new ResponseEntity<>(odontologoService.findAllOdontologos(),HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<OdontologoDto> encontrarOndontologoPorId(@PathVariable Long id){
        return new ResponseEntity<>(odontologoService.findOdontologoById(id),HttpStatus.OK);
    }

    @PostMapping("/crearOdontologo")
    public ResponseEntity<OdontologoDtoRes> crearOdontologo(@RequestBody OdontologoDtoReq odontologoDtoReq){
        return new ResponseEntity<>(odontologoService.createOdontologo(odontologoDtoReq), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteOdontologo/{id}")
    public ResponseEntity<String> deleteOdontologo(@PathVariable long id){
        return new ResponseEntity<>(odontologoService.deleteOdontologo(id),HttpStatus.OK);
    }

    @PutMapping("/updateOdontologo/{id}")
    public ResponseEntity<?> updateOdontologo(@RequestBody OdontologoDtoReq odontologoDtoReq){
        odontologoService.updateOdontologo(odontologoDtoReq);
        return ResponseEntity.ok(HttpStatus.OK);
    }



}
