package com.jhons.SistemaExamenFinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long id_articulo;
    @Column(name="codigo")
    private String codigo;
    @Column(name="nombre")
    private String nombre;
    @Column(name="stock")
    private int stock;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="imagen")
    private String imagen;
    @Column(name="estado")
    private String estado;


    // Relación muchos a uno con Categoria
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //un articulo tiene muchos detalle-venta
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "articulo")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private List<DetallesVenta> detallesVenta;

    // Relación uno a muchos con DetallesIngreso
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "articulo",cascade = CascadeType.ALL)
    private List<DetallesIngreso> detallesIngreso;


    public Articulo() {
    }

    public Articulo(Long id_articulo, String codigo, String nombre, int stock, String descripcion, String imagen, String estado) {
        this.id_articulo = id_articulo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Long getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Long id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void actualizarArticulo(Articulo articuloActual) {
    }
}
