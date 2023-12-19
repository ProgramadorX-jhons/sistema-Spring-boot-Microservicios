package com.jhons.SistemaExamenFinal.Repository;

import com.jhons.SistemaExamenFinal.Entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
