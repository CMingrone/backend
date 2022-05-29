
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.Educacion;
import com.myApp.sprintBoot.Repositorio.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
    
@Autowired
EducacionRepositorio educacionRepo;

    public void crearEducacion(Educacion educacion){
        educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
   
    }
    
    public List<Educacion> listaEducacion(){
        return educacionRepo.findAll();
    }
    
    public Educacion buscarEducacionPorId(Long id){
        return educacionRepo.findById(id).orElse(null);
    }
    public void modificarEducacion(Educacion educacion){
        educacionRepo.save(educacion);
    }
}

