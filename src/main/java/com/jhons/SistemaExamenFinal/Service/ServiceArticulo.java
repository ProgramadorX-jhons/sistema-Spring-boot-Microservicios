package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Articulo;
import com.jhons.SistemaExamenFinal.Repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceArticulo implements ImpleServiceArticulo{

    @Autowired
    private ArticuloRepository repository;
    @Override
    public List<Articulo> obtenerArticulos() {
        return repository.findAll();
    }

    @Override
    public Articulo obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarArticulo(Articulo articulo) {
        repository.save(articulo);
    }
    @Override
    public void eliminarArticulo(Long id) {
        repository.deleteById(id);
    }

    public Articulo actualizarArticulo(Long id, Articulo articulo) {
        Articulo articuloActual= repository.findById(id).orElse(null);

        if(articuloActual !=null){
            articuloActual.setId_articulo(articulo.getId_articulo());
            articuloActual.setCodigo(articulo.getCodigo());
            articuloActual.setDescripcion(articulo.getDescripcion());
            articuloActual.setEstado(articulo.getEstado());
            articuloActual.setImagen(articulo.getImagen());
            articuloActual.setNombre(articulo.getNombre());
            articuloActual.setStock(articulo.getStock());

            return repository.save(articuloActual);
        }else{
            return null;
        }

    }
}
