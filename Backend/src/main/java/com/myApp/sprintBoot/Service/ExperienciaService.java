
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Experiencia;
import com.myApp.sprintBoot.Repositorio.ExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    
@Autowired
ExperienciaRepositorio experienciaRepo;

    public void crearExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
    public List<Experiencia> listaExperiencia(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia buscarExperienciaPorId(Long id){
        return experienciaRepo.findById(id).orElse(null);
    }
    public void modificarExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);
    }
}
