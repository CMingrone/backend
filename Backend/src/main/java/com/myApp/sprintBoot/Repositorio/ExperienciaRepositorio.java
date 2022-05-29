
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Long> {
    
}
