package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.DetallesVenta;
import com.jhons.SistemaExamenFinal.Repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceDetallesVenta implements ImpleServiceDetalleVenta {

    @Autowired
    private DetalleVentaRepository repository;

    @Override
    public List<DetallesVenta> obtenerDetallesVenta() {
        return repository.findAll();
    }

    @Override
    public DetallesVenta obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarDetallesVenta(DetallesVenta detallesVenta) {
        repository.save(detallesVenta);
    }

    @Override
    public void eliminarDetallesVenta(Long id) {
        repository.deleteById(id);
    }

    @Override
    public DetallesVenta actualuzarDetalleVenta(Long id, DetallesVenta detallesVenta) {
        DetallesVenta Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdDetalleVenta(detallesVenta.getIdDetalleVenta());
            Actual.setCantidad(detallesVenta.getCantidad());
            Actual.setVenta(detallesVenta.getVenta());
            Actual.setDescuento(detallesVenta.getDescuento());

            Actual.actualizarDetalleVenta(Actual);

            return repository.save(Actual);
        } else {

            return null;
        }
    }

}

