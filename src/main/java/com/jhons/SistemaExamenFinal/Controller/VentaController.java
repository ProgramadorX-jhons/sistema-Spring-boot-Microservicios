package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Users;
import com.jhons.SistemaExamenFinal.Entity.Venta;
import com.jhons.SistemaExamenFinal.Service.ServiceVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private ServiceVenta service;

    @GetMapping
    public List<Venta> obtenerTodos(){
        return service.obtenerVenta();
    }
    @PostMapping("/{id}")
    public Venta obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarVenta(Venta venta){
        service.guardarVenta(venta);
    }

    @PutMapping("/venta/guardar")
    public Venta actualizarVenta(@PathVariable Long id,@RequestBody Venta venta){
        return service.actualizarVenta(id, venta) ;
    }

    @DeleteMapping("/venta/actualizar/{id}")
    public void eliminarVenta(@PathVariable  Long id){
        service.eliminarVenta(id);
    }

}
