
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
    
}
