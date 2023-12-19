package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.DetallesVenta;
import com.jhons.SistemaExamenFinal.Entity.Ingreso;
import com.jhons.SistemaExamenFinal.Repository.IngresoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIngreso implements ImpleServiceIngreso {

    private IngresoRepository repository;

    @Override
    public List<Ingreso> obtenerIngreso() {
        return repository.findAll();
    }

    @Override
    public Ingreso obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarIngreso(Ingreso ingreso) {
        repository.save(ingreso);
    }

    @Override
    public void eliminarIngreso(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Ingreso actualizarIngreso(Long id, Ingreso ingreso) {
        Ingreso Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdIngreso(ingreso.getIdIngreso());
            Actual.setEstado(ingreso.getEstado());
            Actual.setImpuesto(ingreso.getImpuesto());
            Actual.setFechaHora(ingreso.getFechaHora());
            Actual.setNumComprobante(ingreso.getNumComprobante());
            Actual.setTopoComprobante(ingreso.getTopoComprobante());

            return repository.save(Actual);
        } else {

            return null;
        }
    }
}


