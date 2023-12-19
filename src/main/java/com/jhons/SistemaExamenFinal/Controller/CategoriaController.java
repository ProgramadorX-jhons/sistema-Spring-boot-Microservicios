package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Articulo;
import com.jhons.SistemaExamenFinal.Entity.Categoria;
import com.jhons.SistemaExamenFinal.Service.ServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

   //declaro la clase service
    @Autowired
    private ServiceCategoria service;

    //todos los metodos
    @GetMapping
    public List<Categoria> obtenerTodos(){
        return service.obtenerCategorias();
    }
    @PostMapping("/{id}")
    public Categoria obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarCategoria(Categoria categoria){
        service.guardarCategoria(categoria);
    }

    @DeleteMapping("/categoria/guardar")
    public void eliminarCategoria(@PathVariable  Long id){
        service.eliminarCategoria(id);
    }

    @PutMapping("/categoria/actualizar/{id}")
    public  Categoria actualizarCategoria(@RequestBody Categoria categoria,@PathVariable Long id){
        return  service.actualizarCategoria(id, categoria);
    }

}
