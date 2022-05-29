
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepositorio extends JpaRepository<AcercaDe, Long> {
    
}
