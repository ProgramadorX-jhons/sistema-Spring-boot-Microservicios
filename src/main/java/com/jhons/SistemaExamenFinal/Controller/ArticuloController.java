package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Articulo;
import com.jhons.SistemaExamenFinal.Service.ServiceArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {

    @Autowired
    private ServiceArticulo service;

    @GetMapping
    public List<Articulo> obtenerTodos(){
        return service.obtenerArticulos();
    }
    @PostMapping("/{id}")
    public Articulo obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarArticulo(Articulo articulo){
        service.guardarArticulo(articulo);
    }

    @DeleteMapping("/articulo/guardar")
    public void eliminarArticulo(@PathVariable  Long id){
        service.eliminarArticulo(id);
    }

    @PutMapping("/articulo/actualizar/{id}")
    public Articulo actualizarArticulo(@RequestBody Articulo articulo, @PathVariable Long id){
        return service.actualizarArticulo(id, articulo);


    }






}
