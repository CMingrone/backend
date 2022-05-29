
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.Persona;
import com.myApp.sprintBoot.Service.PersonaService;
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
public class ControllerPersona {
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona") 
    @ResponseBody
    public List<Persona> listarPersona(){
        return personaService.listaPersona();
    }
    @PostMapping("/persona")
    public void crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
    }
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaPorId(id);
    }
    @PutMapping("/personaModificada")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }
}
