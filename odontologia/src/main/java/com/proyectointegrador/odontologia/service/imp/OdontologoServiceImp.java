package com.proyectointegrador.odontologia.service.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.dto.response.OdontologoDtoRes;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.repository.IOdontologoRepository;
import com.proyectointegrador.odontologia.service.IOdontologoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoServiceImp implements IOdontologoService {
    private final IOdontologoRepository odontologoRepository;
    ObjectMapper mapper = new ObjectMapper();

    public OdontologoServiceImp(IOdontologoRepository odontologoRepository){
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public List<OdontologoDtoRes> findAllOdontologos() {
        List<Odontologo> listaOdontologos = odontologoRepository.findAll();
        List<OdontologoDtoRes> odontologoDtoRes = new ArrayList<>();
        for (Odontologo odontologo:listaOdontologos ) {
            odontologoDtoRes.add(mapper.convertValue(odontologo, OdontologoDtoRes.class));
        }
        return odontologoDtoRes;
    }

    @Override
    public Odontologo findOdontologoById(Long id) {
        return null;
    }

    @Override
    public Odontologo createOdontologo(OdontologoDtoReq newOdontologoReq) {
        Odontologo odontologo = mapper.convertValue(newOdontologoReq,Odontologo.class);
        System.out.println("odontologo: "+odontologo);
        if(odontologo != null){
            return odontologoRepository.save(odontologo);
        }
        return new Odontologo();
    }

    @Override
    public String deleteOdontologo(Long id) {
        if(odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            return "El odontologo con el id "+id+"ha sido borrado";
        }
        return "El odontologo con el id "+ id +"no existe en la BD";
    }

    @Override
    public OdontologoDtoRes updateOdontologo(Long id, OdontologoDtoReq odontologoDtoReq) {
        Odontologo odontologo = odontologoRepository.findById(id).orElseThrow(() -> new RuntimeException("Odontologo no encontrado"));
        odontologo.setNombre(odontologoDtoReq.getNombre());
        odontologo.setApellido(odontologoDtoReq.getApellido());
        mapper.convertValue(odontologoDtoReq, Odontologo.class);
        odontologoRepository.save(odontologo);
        return mapper.convertValue(odontologo,OdontologoDtoRes.class);
    }
}
