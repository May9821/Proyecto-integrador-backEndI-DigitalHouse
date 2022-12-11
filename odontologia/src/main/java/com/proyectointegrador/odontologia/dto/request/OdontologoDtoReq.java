package com.proyectointegrador.odontologia.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OdontologoDtoReq {
    private Long id;
    private String nombre;
    private String apellido;
    private Integer matricula;
}
