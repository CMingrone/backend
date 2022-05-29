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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String school;
    String title;
    String start;
    String end;
    String img;
    Long idPersona;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, String start, String end,String img,Long idPersona) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.start = start;
        this.end = end;
        this.img = img;
        this.idPersona = idPersona;
    }

    
    
}
