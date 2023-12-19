package com.jhons.SistemaExamenFinal.Repository;

import com.jhons.SistemaExamenFinal.Entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresoRepository extends JpaRepository<Ingreso, Long> {
}
