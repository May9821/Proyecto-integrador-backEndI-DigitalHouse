package com.proyectointegrador.odontologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

    @OneToOne(mappedBy = "domicilio")
    @JsonIgnore
    private Paciente paciente;
}
