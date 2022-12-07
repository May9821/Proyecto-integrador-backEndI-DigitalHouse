package com.proyectointegrador.odontologia.repository;


import com.proyectointegrador.odontologia.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {



}
