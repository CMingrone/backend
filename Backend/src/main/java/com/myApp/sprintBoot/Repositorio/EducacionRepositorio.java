
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, Long> {
    
}
