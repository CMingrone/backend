
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.AcercaDe;
import com.myApp.sprintBoot.Modelo.Educacion;
import com.myApp.sprintBoot.Service.EducacionService;
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
public class ControllerEducacion {
    @Autowired
    EducacionService educacionService;
    

    @GetMapping("/educacion") 
    @ResponseBody
    public List<Educacion> listarEducacion(){
        return educacionService.listaEducacion();
    }
    @PostMapping("/educacion")
    public void crearEducacion(@RequestBody Educacion educacion){
        educacionService.crearEducacion(educacion);
        
    }
    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
        
    }
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacionPorId(@PathVariable Long id){
        return educacionService.buscarEducacionPorId(id);
    }
    @PutMapping("/educacion/{id}")
    public void modificarEducacion(@RequestBody Educacion educacion,@PathVariable Long id){
        //educacion.setId(id);
        educacionService.modificarEducacion(educacion);
    }

}