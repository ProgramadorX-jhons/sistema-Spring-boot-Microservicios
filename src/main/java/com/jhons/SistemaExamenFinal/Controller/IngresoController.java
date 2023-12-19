package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Ingreso;
import com.jhons.SistemaExamenFinal.Service.ServiceIngreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
    @Autowired
    private ServiceIngreso service;
    @GetMapping
    public List<Ingreso> obtenerTodos(){
        return service.obtenerIngreso();
    }
    @PostMapping("/{id}")
    public Ingreso obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarIngreso(Ingreso ingreso){
        service.guardarIngreso(ingreso);
    }
    @DeleteMapping("/ingreso/guardar")
    public void eliminarIngreso(@PathVariable  Long id){
        service.eliminarIngreso(id);
    }

    @PutMapping("/ingreso/actualizar/{id}")
    public Ingreso actualizarIngreso(@RequestBody Ingreso ingreso ,@PathVariable Long id){
        return service.actualizarIngreso(id, ingreso);
    }


}
