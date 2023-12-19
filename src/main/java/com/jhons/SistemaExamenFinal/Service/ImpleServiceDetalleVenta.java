package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.DetallesVenta;

import java.util.List;

public interface ImpleServiceDetalleVenta {

    List<DetallesVenta> obtenerDetallesVenta();
    DetallesVenta obtenerPorId(Long id);
    void guardarDetallesVenta(DetallesVenta detallesVenta);
    void eliminarDetallesVenta(Long id);
    DetallesVenta actualuzarDetalleVenta(Long id,DetallesVenta detallesVenta);
}
