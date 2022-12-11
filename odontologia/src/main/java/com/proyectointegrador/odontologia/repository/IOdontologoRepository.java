package com.proyectointegrador.odontologia.repository;


import com.proyectointegrador.odontologia.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {



}
