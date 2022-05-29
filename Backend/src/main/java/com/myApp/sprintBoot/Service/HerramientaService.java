
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Herramienta;
import com.myApp.sprintBoot.Modelo.Persona;
import com.myApp.sprintBoot.Repositorio.HerramientaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerramientaService {
    
@Autowired
HerramientaRepositorio herramientaRepo;

    public void crearHerramienta(Herramienta herramienta){
        herramientaRepo.save(herramienta);
    }
    
    public void borrarHerramienta(Long id){
        herramientaRepo.deleteById(id);
    }
    
    public List<Herramienta> listaHerramienta(){
        return herramientaRepo.findAll();
    }
    
    public Herramienta buscarHerramientaPorId(Long id){
        return herramientaRepo.findById(id).orElse(null);
    }
    public void modificarHerramienta(Herramienta herramienta){
        herramientaRepo.save(herramienta);
    }
}
