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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Basic
    String fullName;
    String position;
    String ubication;
    String url;

    public Persona() {
    }

    public Persona(Long id, String fullName, String position, String ubication, String url) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.ubication = ubication;
        this.url = url;
    }

    
    
}
