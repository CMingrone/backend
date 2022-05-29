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
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String comentario;
    Long idPersona;
    
    public AcercaDe() {
    }

    public AcercaDe(Long id, String comentario, Long idPersona) {
        this.id = id;
        this.comentario = comentario;      
        this.idPersona = idPersona;
    }

    
    
}
