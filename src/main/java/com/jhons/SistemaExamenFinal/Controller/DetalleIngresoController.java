package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.DetallesIngreso;
import com.jhons.SistemaExamenFinal.Service.ServiceDetallesIngreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleIngreso")
public class DetalleIngresoController {

    @Autowired
    private ServiceDetallesIngreso service;

    @GetMapping
    public List<DetallesIngreso> obtenerTodos(){
        return service.obtenerDetalleIngreso();
    }
    @PostMapping("/{id}")
    public DetallesIngreso obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarDetalleIngreso(DetallesIngreso detallesIngreso){
        service.guardarDetalleIngreso(detallesIngreso);
    }
    @DeleteMapping("/detallesIngreso/guardar")
    public void eliminarDetalleIngreso(@PathVariable  Long id){
        service.eliminarDetalleIngreso(id);
    }
    @PutMapping("/detallesIngreso/actualizar/{id}")
    public DetallesIngreso actualizarDetallesIngreso(@RequestBody DetallesIngreso detallesIngreso, @PathVariable Long id){
        return service.actualizarDetalleIngreso(id,detallesIngreso);


        }
    }






