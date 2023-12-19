package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Persona;
import com.jhons.SistemaExamenFinal.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicePersona implements ImpleServicePersona{

    @Autowired
    private PersonaRepository repository;
    @Override
    public List<Persona> obtenerPersona() {
        return repository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarPersona(Persona persona) {
        repository.save(persona);
    }
    @Override
    public void eliminarPersona(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdPersona(persona.getIdPersona());
            Actual.setDireccion(persona.getDireccion());
            Actual.setTipoPersona(persona.getTipoPersona());
            Actual.setEmail(persona.getEmail());
            Actual.setNombre(persona.getNombre());
            Actual.setNumDocumento(persona.getNumDocumento());
            Actual.setTelefono(persona.getTelefono());


            return repository.save(Actual);
        } else {

            return null;
        }
    }
}


