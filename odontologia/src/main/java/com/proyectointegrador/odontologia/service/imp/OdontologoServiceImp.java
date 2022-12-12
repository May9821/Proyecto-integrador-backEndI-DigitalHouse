package com.proyectointegrador.odontologia.service.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.OdontologoDto;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.repository.IOdontologoRepository;
import com.proyectointegrador.odontologia.service.IOdontologoService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OdontologoServiceImp implements IOdontologoService {
    private static final Logger LOGGER = Logger.getLogger(PacienteServiceImp.class);

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
        LOGGER.info("Odontologos encontrados con éxito");
        return odontologoDto;
    }

    @Override
    public OdontologoDto findOdontologoById(Long id) {
        Optional<Odontologo> odontologoEncontrado = odontologoRepository.findById(id);
        OdontologoDto odontologoDto = null;
        if (odontologoEncontrado.isEmpty()){
            throw new RuntimeException( "no se encuentra el odontologo");
        }else {
            odontologoDto = mapper.convertValue(odontologoEncontrado,OdontologoDto.class);
        }
        LOGGER.info("Odontologo encontrado con éxito");

        return odontologoDto;
    }

    @Override
    public OdontologoDtoRes createOdontologo(OdontologoDtoReq newOdontologoReq) {
        Odontologo odontologo = mapper.convertValue(newOdontologoReq,Odontologo.class);
        odontologoRepository.save(odontologo);
        OdontologoDtoRes respuesta = new OdontologoDtoRes();
        respuesta.setOdontologo(mapper.convertValue(odontologo, OdontologoDto.class));
        respuesta.setMensaje("Odontologo creado exitosamente con id: "+odontologo.getId());
        LOGGER.info("Odontologo creado con éxito");
        return respuesta;
    }
    @Override
    public String updateOdontologo(OdontologoDtoReq odontologoDtoReq) {
        Odontologo Odontologo = mapper.convertValue(odontologoDtoReq, Odontologo.class);
        odontologoRepository.save(Odontologo);
        LOGGER.info("Odontologo actualizado con éxito");
        return "Odontologo actualizado";
    }

    @Override
    public String deleteOdontologo(Long id) {
        if(odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            LOGGER.info("Odontologo borrado con éxito");
            return "El odontologo con el id "+id+"ha sido borrado";
        }
        LOGGER.error("Odontologo no existe en la base de datos, no puede ser eliminado");
        return "El odontologo con el id "+ id +"no existe en la BD";
    }

}
