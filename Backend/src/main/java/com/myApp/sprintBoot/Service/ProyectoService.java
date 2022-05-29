
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Persona;
import com.myApp.sprintBoot.Modelo.Proyecto;
import com.myApp.sprintBoot.Repositorio.PersonaRepositorio;
import com.myApp.sprintBoot.Repositorio.ProyectoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    
@Autowired
ProyectoRepositorio proyectoRepo;

    public void crearProyecto(Proyecto proyecto){
        proyectoRepo.save(proyecto);
    }
    
    public void borrarProyecto(Long id){
        proyectoRepo.deleteById(id);
    }
    
    public List<Proyecto> listaProyecto(){
        return proyectoRepo.findAll();
    }
    
    public Proyecto buscarProyectoPorId(Long id){
        return proyectoRepo.findById(id).orElse(null);
    }
    public void modificarProyecto(Proyecto proyecto){
        proyectoRepo.save(proyecto);
    }
}
