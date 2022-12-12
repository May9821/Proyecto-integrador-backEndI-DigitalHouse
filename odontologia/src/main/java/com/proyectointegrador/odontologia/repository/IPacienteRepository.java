package com.proyectointegrador.odontologia.repository;

import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    @Query("select p from Paciente p where p.id = ?1")
    Paciente findPacienteById(Long id);


}
