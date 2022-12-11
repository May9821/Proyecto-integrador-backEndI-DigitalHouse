package com.proyectointegrador.odontologia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="odontologos")
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;
    private String apellido;
    private Integer matricula;

   @OneToMany(mappedBy = "odontologo", fetch = FetchType.LAZY)
   private List<Turno> turnos;

}
