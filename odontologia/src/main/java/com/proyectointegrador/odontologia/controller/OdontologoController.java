package com.proyectointegrador.odontologia.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public ResponseEntity<List<OdontologoDtoRes>> findAllOdontologos(){
        return new ResponseEntity<>(odontologoService.findAllOdontologos(),HttpStatus.OK);
    }

    @PostMapping("/crearOdontologo")
    public ResponseEntity<String> crearOdontologo(@RequestBody OdontologoDtoReq odontologoDtoReq){
        odontologoService.createOdontologo(odontologoDtoReq);
        return new ResponseEntity<>("odontologo creado con exito", HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteOdontologo/{id}")
    public ResponseEntity<String> deleteOdontologo(@PathVariable long id){
        return new ResponseEntity<>(odontologoService.deleteOdontologo(id),HttpStatus.OK);
    }

    @PutMapping("/updateOdontologo/{id}")
    public ResponseEntity<?> updateOdontologo(@PathVariable Long id, @RequestBody OdontologoDtoReq odontologoDtoReq){
        odontologoService.updateOdontologo(id,odontologoDtoReq);
        return ResponseEntity.ok(HttpStatus.OK);
    }



}
