package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Articulo;
import com.jhons.SistemaExamenFinal.Entity.Categoria;

import java.util.List;

public interface ImpleServiceArticulo {

    //metodos
    List<Articulo> obtenerArticulos();
    Articulo obtenerPorId(Long id);
    void guardarArticulo(Articulo articulo);
    void eliminarArticulo(Long id);
    Articulo actualizarArticulo(Long id, Articulo articulo);




}
