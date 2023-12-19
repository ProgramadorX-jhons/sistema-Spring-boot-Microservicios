package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Venta;

import java.util.List;

public interface ImpleServiceVenta {

    List<Venta> obtenerVenta();
    Venta obtenerPorId(Long id);
    void guardarVenta(Venta venta);
    Venta actualizarVenta(Long id, Venta venta);
    void eliminarVenta(Long id);

}
