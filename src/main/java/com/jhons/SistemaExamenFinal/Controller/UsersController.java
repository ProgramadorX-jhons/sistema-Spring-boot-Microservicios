package com.jhons.SistemaExamenFinal.Controller;

import com.jhons.SistemaExamenFinal.Entity.Persona;
import com.jhons.SistemaExamenFinal.Entity.Users;
import com.jhons.SistemaExamenFinal.Service.ServiceUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private ServiceUsers service;


    @GetMapping
    public List<Users> obtenerTodos(){
        return service.obtenerUsers();
    }
    @PostMapping("/{id}")
    public Users obtenerPorId(Long id){
        return service.obtenerPorId(id);
    }
    @PutMapping("/{id}")
    public void guardarUsers(Users users){
        service.guardarUsers(users);
    }

    @PutMapping("/users/guardar")
    public Users actualizarUsers(@PathVariable Long id,@RequestBody Users users){
     return service.actualizarUsers(id , users);
    }

    @DeleteMapping("/users/actualizar/{id}")
    public void eliminarUsers(@PathVariable  Long id){
        service.eliminarUsers(id);
    }
}


