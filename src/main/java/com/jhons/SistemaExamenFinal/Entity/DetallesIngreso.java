package com.jhons.SistemaExamenFinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name="detallesIngreso")
public class DetallesIngreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detallesIngreso")
    private Long detalleIngreso;
    @Column(name="cantidad")
    private  Integer cantidad;
    @Column(name="precioCompra")
    private Double precioCompra;
    @Column(name="precioVenta")
    private Double precioVenta;

    // Relación muchos a uno con Categoria
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    // Relación muchos a uno con Ingreso
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_ingreso")
    private Ingreso ingreso;

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }


    //contructores
    public DetallesIngreso() {
    }

    public DetallesIngreso(Long detalleIngreso, Integer cantidad, Double precioCompra, Double precioVenta) {
        this.detalleIngreso = detalleIngreso;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    //get y set

    public Long getIdetalleIngreso() {
        return detalleIngreso;
    }

    public void setIdDetalleIngreso(Long idDetalleIngreso) {
        this.detalleIngreso = idDetalleIngreso;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void actualizarDetalleIngreso(DetallesIngreso actual) {
    }
}
