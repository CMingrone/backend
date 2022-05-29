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
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String usuario;
    String contrasenia;
    Long idPersona;
    
    public Login() {
    }

    public Login(Long id, String usuario, String contrasenia, Long idPersona) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;      
        this.idPersona = idPersona;
    }

    
    
}
