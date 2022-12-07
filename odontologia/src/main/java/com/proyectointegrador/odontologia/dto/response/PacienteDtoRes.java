package com.proyectointegrador.odontologia.dto.response;

import com.proyectointegrador.odontologia.entity.Domicilio;
import com.proyectointegrador.odontologia.entity.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PacienteDtoRes {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaIngreso;
    /*private Domicilio domicilio;
    private List<Turno> turnos;
*/
}
