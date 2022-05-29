
package com.myApp.sprintBoot.Controlador;

import com.myApp.sprintBoot.Modelo.AcercaDe;
import com.myApp.sprintBoot.Service.AcercaDeService;
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
public class ControllerAcercaDe {
    @Autowired
    AcercaDeService acercaDeService;
    

    @GetMapping("/acercaDe") 
    @ResponseBody
    public List<AcercaDe> listarAcercaDe(){
        return acercaDeService.listaAcercaDe();
    }
    @PostMapping("/acercaDe")
    public void crearAcercaDe(@RequestBody AcercaDe acercaDe){
        acercaDeService.crearAcercaDe(acercaDe);
    }
    @DeleteMapping("/acercaDe/{id}")
    public void borrarAcercaDe(@PathVariable Long id){
        acercaDeService.borrarAcercaDe(id);
    }
    @GetMapping("/acercaDe/{id}")
    @ResponseBody
    public AcercaDe buscarAcercaDePorId(@PathVariable Long id){
        return acercaDeService.buscarAcercaDePorId(id);
    }
    @PutMapping("/acercaDeModificada")
    public void modificarAcercaDe(@RequestBody AcercaDe acercaDe){
        acercaDeService.modificarAcercaDe(acercaDe);
    }
}