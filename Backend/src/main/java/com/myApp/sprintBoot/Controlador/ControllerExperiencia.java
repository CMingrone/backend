
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.Experiencia;
import com.myApp.sprintBoot.Service.ExperienciaService;
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
public class ControllerExperiencia {
    @Autowired
    ExperienciaService experienciaService;
    

    @GetMapping("/experiencia") 
    @ResponseBody
    public List<Experiencia> listarExperiencia(){
        return experienciaService.listaExperiencia();
    }
    @PostMapping("/experiencia")
    public void crearExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.crearExperiencia(experiencia);
    }
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    }
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperienciaPorId(@PathVariable Long id){
        return experienciaService.buscarExperienciaPorId(id);
    }
    @PutMapping("/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.modificarExperiencia(experiencia);
    }
}