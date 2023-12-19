package com.jhons.SistemaExamenFinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="venta")
public class Venta {

    @Id
    @GeneratedValue
    @Column(name="id_venta")
    private Long idVenta;
    @Column(name="tipoComprobante")
    private String tipoComprobante;
    @Column(name="serieComprobante")
    private String serieComprobante;
    @Column(name="numComprobante")
    private String numComprobante;
    @Column(name="fechaHora")
    private Date fechaHora;
    @Column(name="impuesto")
    private Double impuesto;
    @Column(name="totalVenta")
    private Double totalVenta;
    @Column(name="total")
    private String total;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "venta",cascade = CascadeType.ALL)
    private List<DetallesVenta> detallesVentas;


    // una Venta tiene muchas Personas
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "venta",cascade = CascadeType.ALL)
    private List<Persona> personas;


    // Muchas Ventas un  Users
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "id_users")
    private Users users;

    //metodos

    public Venta() {
    }

    public Venta(Long idVenta, String tipoComprobante, String serieComprobante, String numComprobante, Date fechaHora, Double impuesto, Double totalVenta, String total) {
        this.idVenta = idVenta;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.numComprobante = numComprobante;
        this.fechaHora = fechaHora;
        this.impuesto = impuesto;
        this.totalVenta = totalVenta;
        this.total = total;
    }

    //metodos get y set
    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void actualizarVenta(Venta actual) {
    }
}
