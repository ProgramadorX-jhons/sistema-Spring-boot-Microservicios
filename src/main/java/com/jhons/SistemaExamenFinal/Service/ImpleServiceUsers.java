package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Users;

import java.util.List;

public interface ImpleServiceUsers {

    List<Users> obtenerUsers();
    Users obtenerPorId(Long id);
    void guardarUsers(Users users);
    Users actualizarUsers(Long id, Users users);
    void eliminarUsers(Long id);
}
