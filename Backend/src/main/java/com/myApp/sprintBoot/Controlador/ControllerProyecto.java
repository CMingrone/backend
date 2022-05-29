
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.Proyecto;
import com.myApp.sprintBoot.Service.ProyectoService;
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
public class ControllerProyecto {
    @Autowired
    ProyectoService proyectoService;
    

    @GetMapping("/proyecto") 
    @ResponseBody
    public List<Proyecto> listarProyectos(){
        return proyectoService.listaProyecto();
    }
    @PostMapping("/proyecto")
    public void crearProyecto(@RequestBody Proyecto proyecto){
        proyectoService.crearProyecto(proyecto);
    }
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoService.borrarProyecto(id);
    }
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyectoPorId(@PathVariable Long id){
        return proyectoService.buscarProyectoPorId(id);
    }
    @PutMapping("/proyecto")
    public void modificarProyecto(@RequestBody Proyecto proyecto){
        proyectoService.modificarProyecto(proyecto);
    }
}