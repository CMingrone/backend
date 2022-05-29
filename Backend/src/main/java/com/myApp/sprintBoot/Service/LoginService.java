
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Login;
import com.myApp.sprintBoot.Repositorio.LoginRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
@Autowired
LoginRepositorio loginRepo;

    public void crearLogin(Login login){
        loginRepo.save(login);
    }
    
    public void borrarLogin(Long id){
        loginRepo.deleteById(id);
    }
    
    public List<Login> listaLogin(){
        return loginRepo.findAll();
    }
    
    public Login buscarLoginPorId(Long id){
        return loginRepo.findById(id).orElse(null);
    }
    public void modificarLogin(Login login){
        loginRepo.save(login);
    }
    public boolean login(Login login){
        return loginRepo.existsByUsuarioAndContrasenia(login.getUsuario(),login.getContrasenia());
    }
}
