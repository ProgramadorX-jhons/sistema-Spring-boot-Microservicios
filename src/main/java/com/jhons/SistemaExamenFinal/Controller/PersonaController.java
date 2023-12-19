package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Ingreso;
import com.jhons.SistemaExamenFinal.Entity.Persona;
import com.jhons.SistemaExamenFinal.Service.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private ServicePersona service;

    @GetMapping
    public List<Persona> obtenerTodos(){
        return service.obtenerPersona();
    }
    @PostMapping("/{id}")
    public Persona obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarPersona(Persona persona){
        service.guardarPersona(persona);
    }

    @DeleteMapping("/personas/guardar")
    public void eliminarPersona(@PathVariable  Long id){
        service.eliminarPersona(id);
    }
    @PutMapping("/personas/actualizar/{id}")
    public Persona actualizarPersona(@PathVariable Long id,@RequestBody Persona persona){
        return  service.actualizarPersona(id, persona);


    }

}
