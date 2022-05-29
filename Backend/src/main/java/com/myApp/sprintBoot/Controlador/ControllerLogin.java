
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.Login;
import com.myApp.sprintBoot.Service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins={"http://localhost:4200/",
                      "http://localhost:50709/"})
public class ControllerLogin {
    @Autowired
    LoginService loginService;
    
    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody Login login){
        return loginService.login(login);
    }
    
    @GetMapping("/login") 
    @ResponseBody
    public List<Login> listarLogin(){
        return loginService.listaLogin();
    }
    
    //@PostMapping("/loginNew")
    //public void crearLogin(@RequestBody Login login){
    //    loginService.crearLogin(login);
    //}
    @DeleteMapping("/login/{id}")
    public void borrarLogin(@PathVariable Long id){
        loginService.borrarLogin(id);
    }
    @GetMapping("/login/{id}")
    @ResponseBody
    public Login buscarLoginPorId(@PathVariable Long id){
        return loginService.buscarLoginPorId(id);
    }
    @PutMapping("/login")
    public void modificarLogin(@RequestBody Login login){
        loginService.modificarLogin(login);
    }
}