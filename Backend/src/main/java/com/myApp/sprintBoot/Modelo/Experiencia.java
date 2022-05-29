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
public class Experiencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String empresa;
    String puesto;
    String tareas;
    String tipo;
    String start;
    String end;
    String img;
    Long idPersona;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, String tareas, String tipo, String start, String end, String img, Long idPersona) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.tareas = tareas;
        this.tipo = tipo;
        this.start = start;
        this.end = end;
        this.img = img;
        this.idPersona = idPersona;
    }

    
    
}
