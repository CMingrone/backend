
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Herramienta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerramientaRepositorio extends JpaRepository<Herramienta, Long> {
    
}
