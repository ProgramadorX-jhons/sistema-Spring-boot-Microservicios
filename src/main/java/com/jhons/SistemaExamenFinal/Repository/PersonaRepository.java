package com.jhons.SistemaExamenFinal.Repository;

import com.jhons.SistemaExamenFinal.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona ,Long> {
}
