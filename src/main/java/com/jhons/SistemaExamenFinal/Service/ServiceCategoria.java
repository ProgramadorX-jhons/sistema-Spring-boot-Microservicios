package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Categoria;
import com.jhons.SistemaExamenFinal.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCategoria implements ImpleServiceCategoria {

    @Autowired
    private CategoriaRepository repository;


    @Override
    public List<Categoria> obtenerCategorias() {
        return null;
    }

    @Override
    public Categoria obtenerPorId(Long id) {
        return null;
    }

    @Override
    public void guardarCategoria(Categoria categoria) {

    }

    @Override
    public void eliminarCategoria(Long id) {

    }


    public Categoria actualizarCategoria(Long id,Categoria categoria) {
        Categoria Actual= repository.findById(id).orElse(null);

        if(Actual !=null){
            Actual.setIdCategoria(categoria.getIdCategoria());
            Actual.setNombre(categoria.getNombre());
            Actual.setDescripcion(categoria.getDescripcion());
            Actual.setCondicion(categoria.getCondicion());

            return repository.save(Actual);
        }else{
            return null;
        }

    }
}


