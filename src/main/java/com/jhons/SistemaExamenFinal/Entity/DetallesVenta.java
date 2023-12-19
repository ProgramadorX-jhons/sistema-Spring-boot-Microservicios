package com.jhons.SistemaExamenFinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name="detallesVenta")
public class DetallesVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detalleVenta")
    private Long idDetalleVenta;
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="venta")
    private Double venta;
    @Column(name="descuento")
    private Double descuento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_venta")
    private Venta ventas;

    public Venta getVentas() {
        return ventas;
    }

    public void setVentas(Venta ventas) {
        this.ventas = ventas;
    }

    //metodos


    public DetallesVenta() {
    }


    public DetallesVenta(Long idDetalleVenta, Integer cantidad, Double venta, Double descuento) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.venta = venta;
        this.descuento = descuento;
    }

    public Long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getVenta() {
        return venta;
    }

    public void setVenta(Double venta) {
        this.venta = venta;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public void actualizarDetalleVenta(DetallesVenta actual) {
    }
}
