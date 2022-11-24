package com.proyectointegrador.odontologia.repository;

import com.proyectointegrador.odontologia.entity.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IDomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
