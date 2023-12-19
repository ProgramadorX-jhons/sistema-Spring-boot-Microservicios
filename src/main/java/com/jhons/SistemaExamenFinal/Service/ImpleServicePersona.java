package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Persona;

import java.util.List;

public interface ImpleServicePersona {


    List<Persona> obtenerPersona();
    Persona obtenerPorId(Long id);
    void guardarPersona(Persona persona);
    void eliminarPersona(Long id);
    Persona actualizarPersona(Long id, Persona persona);



}
