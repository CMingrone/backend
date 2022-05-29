
package com.myApp.sprintBoot.Service;

import com.myApp.sprintBoot.Modelo.AcercaDe;
import com.myApp.sprintBoot.Repositorio.AcercaDeRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService {
    
@Autowired
AcercaDeRepositorio acercaDeRepo;

    public void crearAcercaDe(AcercaDe acercaDe){
        acercaDeRepo.save(acercaDe);
    }
    
    public void borrarAcercaDe(Long id){
        acercaDeRepo.deleteById(id);
    }
    
    public List<AcercaDe> listaAcercaDe(){
        return acercaDeRepo.findAll();
    }
    
    public AcercaDe buscarAcercaDePorId(Long id){
        return acercaDeRepo.findById(id).orElse(null);
    }
    public void modificarAcercaDe(AcercaDe acercaDe){
        acercaDeRepo.save(acercaDe);
    }
}
