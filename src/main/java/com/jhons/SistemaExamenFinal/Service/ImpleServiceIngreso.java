package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Ingreso;

import java.util.List;

public interface ImpleServiceIngreso {


    List<Ingreso> obtenerIngreso();
    Ingreso obtenerPorId(Long id);
    void guardarIngreso(Ingreso ingreso);
    void eliminarIngreso(Long id);

    Ingreso actualizarIngreso(Long id, Ingreso ingreso);


}
