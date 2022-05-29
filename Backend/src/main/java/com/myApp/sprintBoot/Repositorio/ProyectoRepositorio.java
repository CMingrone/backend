
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Long> {
    
}
