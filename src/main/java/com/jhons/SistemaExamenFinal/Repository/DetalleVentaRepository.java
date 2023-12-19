package com.jhons.SistemaExamenFinal.Repository;

import com.jhons.SistemaExamenFinal.Entity.DetallesVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetallesVenta, Long> {

}
