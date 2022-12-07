package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<OdontologoDtoRes> findAllOdontologos();
    Odontologo findOdontologoById(Long id);
    Odontologo createOdontologo(OdontologoDtoReq newOdontologo);
    String deleteOdontologo(Long id);
    OdontologoDtoRes updateOdontologo(Long id,OdontologoDtoReq odontologo);
}
