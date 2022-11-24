package com.proyectointegrador.odontologia.entity;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="odontologos")
public class Odontologo {
    @Id
    @GeneratedValue
    @Column(name="odontologo_id")
    private Integer id;

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Integer matricula;


}
