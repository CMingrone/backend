
package com.myApp.sprintBoot.Repositorio;

import com.myApp.sprintBoot.Modelo.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositorio extends JpaRepository<Login, Long> {
    public boolean existsByUsuarioAndContrasenia(String usuario,String contrasenia);
}
