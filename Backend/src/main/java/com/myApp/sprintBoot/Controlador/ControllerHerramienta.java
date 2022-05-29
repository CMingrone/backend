
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.Herramienta;
import com.myApp.sprintBoot.Service.AcercaDeService;
import com.myApp.sprintBoot.Service.HerramientaService;
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
public class ControllerHerramienta {
    @Autowired
    HerramientaService herramientasService;
    

    @GetMapping("/herramientas") 
    @ResponseBody
    public List<Herramienta> listarHerramientas(){
        return herramientasService.listaHerramienta();
    }
    @PostMapping("/herramientas")
    public void crearHerramienta(@RequestBody Herramienta herramienta){
        herramientasService.crearHerramienta(herramienta);
    }
    @DeleteMapping("/herramienta/{id}")
    public void borrarHerramienta(@PathVariable Long id){
        herramientasService.borrarHerramienta(id);
    }
    @GetMapping("/herramienta/{id}")
    @ResponseBody
    public Herramienta buscarHerramientaPorId(@PathVariable Long id){
        return herramientasService.buscarHerramientaPorId(id);
    }
    @PutMapping("/herramienta")
    public void modificarHerramienta(@RequestBody Herramienta herramienta){
        herramientasService.modificarHerramienta(herramienta);
    }
}