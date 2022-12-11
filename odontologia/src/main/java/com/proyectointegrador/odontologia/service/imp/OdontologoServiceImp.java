package com.proyectointegrador.odontologia.service.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.repository.IOdontologoRepository;
import com.proyectointegrador.odontologia.service.IOdontologoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OdontologoServiceImp implements IOdontologoService {
    private final IOdontologoRepository odontologoRepository;
    ObjectMapper mapper = new ObjectMapper();

    public OdontologoServiceImp(IOdontologoRepository odontologoRepository){
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public List<OdontologoDto> findAllOdontologos() {
        List<Odontologo> listaOdontologos = odontologoRepository.findAll();
        List<OdontologoDto> odontologoDto = listaOdontologos.stream()
                .map(odontologo -> mapper.convertValue(odontologo, OdontologoDto.class))
                .collect(Collectors.toList());
        return odontologoDto;
    }

    @Override
    public OdontologoDto findOdontologoById(Long id) {
//        Optional<Odontologo> odontologoEncontrado = odontologoRepository.findById(id);
////        OdontologoDto respuesta = mapper.convertValue(odontologoEncontrado,OdontologoDto.class);
//
//        /*respuesta.setOdontologo(mapper.convertValue(odontologoEncontrado, OdontologoDto.class));
//        respuesta.setMensaje("Odontologo encontrado exitosamente"+odontologoEncontrado.map());*/
//        return mapper.convertValue(odontologoEncontrado,OdontologoDto.class);
        return null;
    }

    @Override
    public OdontologoDtoRes createOdontologo(OdontologoDtoReq newOdontologoReq) {
        Odontologo odontologo = mapper.convertValue(newOdontologoReq,Odontologo.class);
        odontologoRepository.save(odontologo);
        OdontologoDtoRes respuesta = new OdontologoDtoRes();
        respuesta.setOdontologo(mapper.convertValue(odontologo, OdontologoDto.class));
        respuesta.setMensaje("Odontologo creado exitosamente con id: "+odontologo.getId());
        return respuesta;
    }
    @Override
    public String updateOdontologo(OdontologoDtoReq odontologoDtoReq) {
        Odontologo Odontologo = mapper.convertValue(odontologoDtoReq, Odontologo.class);
        odontologoRepository.save(Odontologo);
        return "Odontologo actualizado";
    }

    @Override
    public String deleteOdontologo(Long id) {
        if(odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            return "El odontologo con el id "+id+"ha sido borrado";
        }
        return "El odontologo con el id "+ id +"no existe en la BD";
    }

}
