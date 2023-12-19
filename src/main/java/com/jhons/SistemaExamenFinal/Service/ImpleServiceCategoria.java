package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Categoria;

import java.util.List;

public interface ImpleServiceCategoria {


    List<Categoria> obtenerCategorias();
    Categoria obtenerPorId(Long id);
    void guardarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
    Categoria actualizarCategoria(Long id, Categoria categoria);
}
