package com.proyectointegrador.odontologia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table
public class Paciente {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String dni;
    @Column
    private Date fechaIngreso;
//    private Domicilio domicilio;

    public Paciente(String nombre, String apellido, String dni, Date fechaIngreso/*, Domicilio domicilio*/) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
//        this.domicilio = domicilio;
    }



}
