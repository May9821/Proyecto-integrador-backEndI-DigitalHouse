package com.proyectointegrador.odontologia.repository;

import com.proyectointegrador.odontologia.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
}
