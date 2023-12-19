package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Articulo;
import com.jhons.SistemaExamenFinal.Entity.DetallesIngreso;

import java.util.List;

public interface ImpleServicedetalleIngreso {

    List<DetallesIngreso> obtenerDetalleIngreso();
    DetallesIngreso obtenerPorId(Long id);
    void guardarDetalleIngreso(DetallesIngreso detallesIngreso);
    void eliminarDetalleIngreso(Long id);
    DetallesIngreso actualizarDetalleIngreso(Long id, DetallesIngreso detallesIngreso);

}
