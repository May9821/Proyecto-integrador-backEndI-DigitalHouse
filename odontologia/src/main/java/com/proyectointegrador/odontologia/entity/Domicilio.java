package com.proyectointegrador.odontologia.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table
public class Domicilio {
    @Id
    @GeneratedValue
    @Column(name = "id_domicilio")
    private Integer id;
    @Column
    private String calle;
    @Column
    private String numero;
    @Column
    private String localidad;
    @Column
    private String provincia;


    public Domicilio(String calle, String numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }


}
