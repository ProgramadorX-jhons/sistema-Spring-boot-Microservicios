package com.jhons.SistemaExamenFinal.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_users")
    private Long idUsers;
    @Column(name="name")
    private  String name;
    @Column(name="email")
    private  String email;
    @Column(name="password")
    private String password;


    // One a muchas Ventas
    @OneToMany(mappedBy = "users")
    private List<Venta> ventas;

    public Users() {
    }

    //con parametros
    public Users(Long idUsers, String name, String email, String password) {
        this.idUsers = idUsers;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //get y set

    public Long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Long idUsers) {
        this.idUsers = idUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void actualizarUsers(Users actual) {
    }
}
