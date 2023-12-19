package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.DetallesVenta;
import com.jhons.SistemaExamenFinal.Service.ServiceDetallesVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallesVenta")
public class DestallesVentaController {


    @Autowired
    private ServiceDetallesVenta service;

    @GetMapping
    public List<DetallesVenta> obtenerTodos(){
        return service.obtenerDetallesVenta();
    }
    @PostMapping("/{id}")
    public DetallesVenta obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarDetalleVenta(DetallesVenta detallesVenta){
        service.guardarDetallesVenta(detallesVenta);
    }
    @DeleteMapping("/detallesVenta/guardar")
    public void eliminarDetalleVenta(@PathVariable  Long id){
        service.eliminarDetallesVenta(id);
    }

    @PutMapping("/detallesVenta/actualizar/{id}")
    public DetallesVenta actualizarDetallesVenta(@RequestBody DetallesVenta detallesVenta, @PathVariable Long id){
        return  service.actualuzarDetalleVenta(id, detallesVenta);


    }





}
