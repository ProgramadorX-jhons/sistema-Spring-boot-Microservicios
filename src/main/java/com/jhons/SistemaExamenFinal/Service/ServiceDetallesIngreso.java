package com.jhons.SistemaExamenFinal.Service;


import com.jhons.SistemaExamenFinal.Entity.DetallesIngreso;
import com.jhons.SistemaExamenFinal.Repository.DetalleIngresorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDetallesIngreso implements ImpleServicedetalleIngreso {

    @Autowired
    private DetalleIngresorepository repository;

    @Override
    public List<DetallesIngreso> obtenerDetalleIngreso() {
        return repository.findAll();
    }

    @Override
    public DetallesIngreso obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarDetalleIngreso(DetallesIngreso detallesIngreso) {
        repository.save(detallesIngreso);
    }

    @Override
    public void eliminarDetalleIngreso(Long id) {
        repository.deleteById(id);
    }

    @Override
    public DetallesIngreso actualizarDetalleIngreso(Long id, DetallesIngreso detallesIngreso) {
        DetallesIngreso Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdDetalleIngreso(detallesIngreso.getIdetalleIngreso());
            Actual.setCantidad(detallesIngreso.getCantidad());
            Actual.setPrecioCompra(detallesIngreso.getPrecioCompra());
            Actual.setPrecioVenta(detallesIngreso.getPrecioVenta());

            Actual.actualizarDetalleIngreso(Actual);

            return repository.save(Actual);
        } else {

            return null;
        }
    }
}


