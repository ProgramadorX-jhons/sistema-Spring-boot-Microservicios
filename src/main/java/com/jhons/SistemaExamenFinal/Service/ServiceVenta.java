package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Venta;
import com.jhons.SistemaExamenFinal.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceVenta implements ImpleServiceVenta {

    @Autowired
    private VentaRepository repository;

    @Override
    public List<Venta> obtenerVenta() {
        return repository.findAll();
    }

    @Override
    public Venta obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarVenta(Venta venta) {
        repository.save(venta);
    }

    @Override
    public Venta actualizarVenta( Long id, Venta venta) {
        Venta Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdVenta(venta.getIdVenta());
            Actual.setImpuesto(venta.getImpuesto());
            Actual.setTotalVenta(venta.getTotalVenta());
            Actual.setFechaHora(venta.getFechaHora());
            Actual.setTotal(venta.getTotal());
            Actual.setNumComprobante(venta.getNumComprobante());

            return repository.save(Actual);

        } else {

            return null;
        }
    }
    @Override
    public void eliminarVenta(Long id) {
        repository.deleteById(id);
    }
}
