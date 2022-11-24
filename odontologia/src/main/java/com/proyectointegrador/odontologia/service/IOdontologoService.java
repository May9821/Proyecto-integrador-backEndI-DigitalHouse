package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<Odontologo> findAllOdontologos();
    Odontologo createOdontologo(Odontologo newOdontologo);
    String deleteOdontologo(Integer id);
}
