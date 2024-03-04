package com.divisas.main.Clases;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Monedas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String codigo_ISO;
    private String simbolo;

    @OneToMany(mappedBy = "monedas",cascade= CascadeType.ALL, orphanRemoval = true , fetch = FetchType.LAZY)
    private List<Transaccion> transacciones = new ArrayList<>();


    @ManyToMany(mappedBy = "monedas")
    private List<Cliente> cliente;


   

    public Monedas(Long id, String nombre, String codigo_ISO, String simbolo, List<Transaccion> transacciones,
            List<Cliente> cliente) {
        this.id = id;
        this.nombre = nombre;
        this.codigo_ISO = codigo_ISO;
        this.simbolo = simbolo;
        this.transacciones = transacciones;
        this.cliente = cliente;
    }

    public Monedas(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo_ISO() {
        return codigo_ISO;
    }

    public void setCodigo_ISO(String codigo_ISO) {
        this.codigo_ISO = codigo_ISO;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Monedas [id=" + id + ", nombre=" + nombre + ", codigo_ISO=" + codigo_ISO + ", simbolo=" + simbolo
                + ", transacciones=" + transacciones + ", cliente=" + cliente + "]";
    }

    
}