package com.proyectointegrador.odontologia.repository;

import com.proyectointegrador.odontologia.dto.PacienteDto;
import com.proyectointegrador.odontologia.dto.TurnoDto;
import com.proyectointegrador.odontologia.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno,Long> {
    @Query("select t from Turno t")
    List<Turno> findAllTurnos2();
}