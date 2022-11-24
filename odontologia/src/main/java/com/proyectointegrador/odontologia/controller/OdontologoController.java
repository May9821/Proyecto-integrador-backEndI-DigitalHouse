package com.proyectointegrador.odontologia.controller;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.service.IOdontologoService;
import com.proyectointegrador.odontologia.service.OdontologoServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private final IOdontologoService odontologoService ;

    public OdontologoController(OdontologoServiceImp odontologoService){
        this.odontologoService = odontologoService;
    }

    @GetMapping("/findAll")
    public List<Odontologo> findAllOdontologos(){
        return odontologoService.findAllOdontologos();
    }

    @PostMapping("/crearOdontologo")
    public ResponseEntity<String> crearOdontologo(@RequestBody Odontologo odontologo){
        odontologoService.createOdontologo(odontologo);
        return new ResponseEntity<>("odontologo creado con exito", HttpStatus.OK);
    }

    @DeleteMapping("/deleteOdontologo/{id}")
    public ResponseEntity<String> deleteOdontologo(@PathVariable Integer id){
        return new ResponseEntity<>(odontologoService.deleteOdontologo(id),HttpStatus.OK);
    }

    /*private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @PostMapping("/new")
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(odontologoService.registrarOdontologo(odontologo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdontologoDto> buscar(@PathVariable Integer id) {
        OdontologoDto odontologoDto = odontologoService.buscar(id).orElse(null);
        return ResponseEntity.ok(odontologoDto);
    }

    @PutMapping("/update")
    public ResponseEntity<Odontologo> actualizar(@RequestBody Odontologo odontologo) {
        ResponseEntity<Odontologo> response = null;

        if (odontologo.getId() != null && odontologoService.buscar(odontologo.getId()).isPresent()) {
            response = ResponseEntity.ok(odontologoService.actualizar(odontologo));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (odontologoService.buscar(id).isPresent()) {
            odontologoService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }*/

}
