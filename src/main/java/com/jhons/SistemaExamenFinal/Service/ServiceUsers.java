package com.jhons.SistemaExamenFinal.Service;

import com.jhons.SistemaExamenFinal.Entity.Persona;
import com.jhons.SistemaExamenFinal.Entity.Users;
import com.jhons.SistemaExamenFinal.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsers implements ImpleServiceUsers{

    @Autowired
    private UsersRepository repository;
    @Override
    public List<Users> obtenerUsers() {
        return repository.findAll();
    }

    @Override
    public Users obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardarUsers(Users users) {
        repository.save(users);
    }

    @Override
    public Users actualizarUsers( Long id,Users users) {
        Users Actual = repository.findById(id).orElse(null);

        if (Actual != null) {
            Actual.setIdUsers(users.getIdUsers());
            Actual.setEmail(users.getEmail());
            Actual.setName(users.getName());
            Actual.setPassword(users.getPassword());
            return repository.save(Actual);
        } else {

            return null;
        }
    }

        @Override
        public void eliminarUsers (Long id){
            repository.deleteById(id);
        }

}
