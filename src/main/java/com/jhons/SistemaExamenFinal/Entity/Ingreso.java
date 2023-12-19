package com.jhons.SistemaExamenFinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="ingreso")
public class Ingreso {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ingreso")
    private Long idIngreso;
    @Column(name="topoComprobante")
    private String topoComprobante;
    @Column(name="munComprobante")
    private String numComprobante;
    @Column(name="fechaHora")
    private Date fechaHora;
    @Column(name="impuesto")
    private Double impuesto;
    @Column(name="estado")
    private  String estado;


    // Un ingreso tiene muchos detalles ingreso
    @OneToMany(mappedBy = "ingreso")
    private List<DetallesIngreso> detallesIngresos;

//muchos ingresos una persona
   @ManyToOne(fetch = FetchType.LAZY)
   @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
   @JoinColumn(name = "id_persona")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    //contrcutores
    public Ingreso() {
    }

    public Ingreso(Long idIngreso, String topoComprobante, String numComprobante, Date fechaHora, Double impuesto, String estado) {
        this.idIngreso = idIngreso;
        this.topoComprobante = topoComprobante;
        this.numComprobante = numComprobante;
        this.fechaHora = fechaHora;
        this.impuesto = impuesto;
        this.estado = estado;
    }

    //get y set
    public Long getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Long idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getTopoComprobante() {
        return topoComprobante;
    }

    public void setTopoComprobante(String topoComprobante) {
        this.topoComprobante = topoComprobante;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void actualizarIngreso(Ingreso actual) {
    }
}
