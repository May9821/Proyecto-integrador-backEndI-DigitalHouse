package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<OdontologoDto> findAllOdontologos();
    OdontologoDto findOdontologoById(Long id);
    OdontologoDtoRes createOdontologo(OdontologoDtoReq newOdontologo);
    String updateOdontologo(OdontologoDtoReq odontologo);
    String deleteOdontologo(Long id);
}
