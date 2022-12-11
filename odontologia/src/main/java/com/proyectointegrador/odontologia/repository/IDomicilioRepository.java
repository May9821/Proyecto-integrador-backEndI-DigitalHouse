package com.proyectointegrador.odontologia.repository;

import com.proyectointegrador.odontologia.entity.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio, Long> {
}
