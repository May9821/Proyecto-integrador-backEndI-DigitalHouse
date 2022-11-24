package com.proyectointegrador.odontologia.service;


import com.proyectointegrador.odontologia.repository.IPacienteRepository;


public class PacienteService {

    private final IPacienteRepository pacienteRepository;

    public PacienteService (IPacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
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
