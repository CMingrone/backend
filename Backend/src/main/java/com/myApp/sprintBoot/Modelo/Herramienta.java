package com.myApp.sprintBoot.Modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String nombre;
    int progreso;
    Long idPersona;
 

    public Herramienta() {
    }

    public Herramienta(Long id, String nombre, int progreso, Long idPersona) {
        this.id= id;
        this.nombre = nombre;
        this.progreso = progreso;
        this.idPersona = idPersona;
    }

    
    
}
