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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String empresa;
    String titulo;
    String descripcion;
    String url;
    String img;
    Long idPersona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String titulo, String descripcion, String url, String img, Long idPersona) {
        this.id = id;
        this.empresa = empresa;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.img = img;
        this.idPersona = idPersona;
    }

    
    
}
