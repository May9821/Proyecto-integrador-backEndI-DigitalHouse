package com.proyectointegrador.odontologia.service;

import com.proyectointegrador.odontologia.dto.request.OdontologoDtoReq;
import com.proyectointegrador.odontologia.entity.Odontologo;
import com.proyectointegrador.odontologia.repository.IOdontologoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImp implements IOdontologoService{
    private final IOdontologoRepository odontologoRepository;

    public OdontologoServiceImp(IOdontologoRepository odontologoRepository){
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public List<Odontologo> findAllOdontologos() {
        return odontologoRepository.findAll();
    }

    @Override
    public Odontologo createOdontologo(Odontologo newOdontologo) {
        if(newOdontologo != null){
            return odontologoRepository.save(newOdontologo);
        }
        return new Odontologo();
    }

    @Override
    public String deleteOdontologo(Integer id) {
        if(odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            return "El odontologo con el id "+id+"ha sido borrado";
        }
        return "El odontologo con el id "+ id +"no existe en la BD";
    }
}
