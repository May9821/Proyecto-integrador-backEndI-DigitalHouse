package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.exception.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
public class OdontologoServiceTest {
    @Autowired
    private IOdontologoService odontologoService;


    @Test
    @DisplayName("Crear un odontologo exitosamente")
    public void testOdontologoCreado() throws ResourceNotFoundException{
        OdontologoDtoReq odontologoDtoReq = new OdontologoDtoReq();
        odontologoDtoReq.setNombre("mayra");
        odontologoDtoReq.setApellido("torres");
        odontologoDtoReq.setMatricula(123456);


        odontologoService.createOdontologo(odontologoDtoReq);
        OdontologoDto odontologoCreado = odontologoService.findOdontologoById(1L);


        Assertions.assertTrue(odontologoCreado!=null);

    }
}
