package com.proyectointegrador.odontologia.service.imp;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.dto.request.PacienteDtoReq;
import com.proyectointegrador.odontologia.dto.response.PacienteDtoRes;
import com.proyectointegrador.odontologia.entity.Paciente;
import com.proyectointegrador.odontologia.repository.IPacienteRepository;
import com.proyectointegrador.odontologia.service.IPacienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteServiceImp implements IPacienteService {

    private final IPacienteRepository pacienteRepository;

    ObjectMapper mapper = new ObjectMapper();
    public PacienteServiceImp(IPacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<PacienteDtoRes> findAllPacientes() {
        List<Paciente>  listaPacientes = pacienteRepository.findAll();
        List<PacienteDtoRes> pacienteDtoResList = new ArrayList<>();
        for (Paciente paciente: listaPacientes ) {
            pacienteDtoResList.add(mapper.convertValue(paciente, PacienteDtoRes.class));
        }
        return pacienteDtoResList;
    }

    @Override
    public Paciente findPacienteById(Long Id) {
        return null;
    }

    @Override
    public Paciente createPaciente(PacienteDtoReq pacienteDtoReq) {
        Paciente paciente = mapper.convertValue(pacienteDtoReq, Paciente.class);
        if (paciente != null){
            return pacienteRepository.save(paciente);
        }
        return new Paciente();
    }

    @Override
    public String deletePaciente(Long id) {
        if (pacienteRepository.findById(id).isPresent()){
            pacienteRepository.deleteById(id);
            return "El paciente con el id: "+ id+" ha sido borrado de forma exitosa";
        }
        return "El paciente con el id: "+id+ "no existe en la BD";
    }

    @Override
    public String updatePaciente(Paciente paciente) {
        return null;
    }




    /*public Paciente guardar(Paciente p) {
        p.setFechaIngreso(new Date());
        return pacienteIDao.guardar(p);
    }

    public Optional<Paciente> buscar(Integer id) {
        return pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        pacienteIDao.eliminar(id);
    }

    public Paciente actualizar(Paciente p) {
        return pacienteIDao.actualizar(p);
    }*/
}
