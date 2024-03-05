package com.divisas.main.Class;


import java.sql.Time;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double cantidadBase;
    private double cantidadDestino;
    private double tasaCambioUtilizado;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.TIME)
    private Time hora;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="id_monedaBase")
    private Monedas monedasBase;

    @ManyToOne
    @JoinColumn(name="id_monedaDestino")
    private Monedas monedasDestino;

    @OneToMany(mappedBy = "transaccion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<HistorialTransaccion> historialTransaccion = new ArrayList<>();



    public Transaccion(Long id, double cantidadBase, double cantidadDestino, double tasaCambioUtilizado, Date fecha,
            Time hora, Cliente cliente, Monedas monedasBase, Monedas monedasDestino,
            List<HistorialTransaccion> historialTransaccion) {
        this.id = id;
        this.cantidadBase = cantidadBase;
        this.cantidadDestino = cantidadDestino;
        this.tasaCambioUtilizado = tasaCambioUtilizado;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.monedasBase = monedasBase;
        this.monedasDestino = monedasDestino;
        this.historialTransaccion = historialTransaccion;
    }

    public Transaccion(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCantidadBase() {
        return cantidadBase;
    }

    public void setCantidadBase(double cantidadBase) {
        this.cantidadBase = cantidadBase;
    }

    public double getCantidadDestino() {
        return cantidadDestino;
    }

    public void setCantidadDestino(double cantidadDestino) {
        this.cantidadDestino = cantidadDestino;
    }

    public double getTasaCambioUtilizado() {
        return tasaCambioUtilizado;
    }

    public void setTasaCambioUtilizado(double tasaCambioUtilizado) {
        this.tasaCambioUtilizado = tasaCambioUtilizado;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return this.hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public Monedas getMonedasBase() {
        return monedasBase;
    }

    public void setMonedasBase(Monedas monedasBase) {
        this.monedasBase = monedasBase;
    }

    public Monedas getMonedasDestino() {
        return monedasDestino;
    }

    public void setMonedasDestino(Monedas monedasDestino) {
        this.monedasDestino = monedasDestino;
    }

    @Override
    public String toString() {
        return "Transaccion [id=" + id + ", cantidadBase=" + cantidadBase + ", cantidadDestino=" + cantidadDestino
                + ", tasaCambioUtilizado=" + tasaCambioUtilizado + ", fecha=" + fecha + ", hora=" + hora + ", cliente="
                + cliente + ", monedasBase=" + monedasBase + ", monedasDestino=" + monedasDestino + "]";
    }
    
 
    





}