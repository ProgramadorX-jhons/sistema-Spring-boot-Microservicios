package com.jhons.SistemaExamenFinal.Repository;

import com.jhons.SistemaExamenFinal.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {


}
