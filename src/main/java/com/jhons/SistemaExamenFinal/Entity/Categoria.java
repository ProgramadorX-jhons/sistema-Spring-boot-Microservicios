package com.jhons.SistemaExamenFinal.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long Categoria;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String Descripcion;
    @Column(name="condicion")
    private Boolean condicion;


    // Relación uno a muchos con Articulo
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "categoria",cascade = CascadeType.ALL)
    private List<Articulo> articulos;

    //metodos
    public Categoria() {
    }

    public Categoria(Long idCategoria, String nombre, String descripcion, Boolean condicion, List<Articulo> articulos) {
        this.Categoria = idCategoria;
        this.nombre = nombre;
        Descripcion = descripcion;
        this.condicion = condicion;
        this.articulos = articulos;
    }

    //set y get


    public Long getIdCategoria() {
        return Categoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.Categoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Boolean getCondicion() {
        return condicion;
    }

    public void setCondicion(Boolean condicion) {
        this.condicion = condicion;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void actualizarCategoria(com.jhons.SistemaExamenFinal.Entity.Categoria actual) {
    }
}
