package com.proyectointegrador.odontologia.dto.request;

import com.proyectointegrador.odontologia.entity.Domicilio;
import com.proyectointegrador.odontologia.entity.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDtoReq {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaIngreso;
//    private Integer domicilio;
//    private List<Turno> turnos;

}
