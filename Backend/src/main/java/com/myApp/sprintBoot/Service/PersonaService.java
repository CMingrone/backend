
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Persona;
import com.myApp.sprintBoot.Repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
@Autowired
PersonaRepositorio personaRepo;

    public void crearPersona(Persona persona){
        personaRepo.save(persona);
    }
    
    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }
    
    public List<Persona> listaPersona(){
        return personaRepo.findAll();
    }
    
    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElse(null);
    }
    public void modificarPersona(Persona persona){
        personaRepo.save(persona);
        
    }
}
