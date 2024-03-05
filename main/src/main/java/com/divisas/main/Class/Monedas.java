package com.divisas.main.Class;

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

  
    @OneToMany(mappedBy = "monedasBase", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Transaccion> transaccionesBase = new ArrayList<>();

    @OneToMany(mappedBy = "monedasDestino", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Transaccion> transaccionesDestino = new ArrayList<>();


    @ManyToMany(mappedBy = "monedas", fetch = FetchType.EAGER)
    private List<Cliente> cliente;


   

 
    public Monedas(Long id, String nombre, String codigo_ISO, String simbolo, List<Transaccion> transaccionesBase,
            List<Transaccion> transaccionesDestino, List<Cliente> cliente) {
        this.id = id;
        this.nombre = nombre;
        this.codigo_ISO = codigo_ISO;
        this.simbolo = simbolo;
        this.transaccionesBase = transaccionesBase;
        this.transaccionesDestino = transaccionesDestino;
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



    public String toString() {
        return "Monedas [id=" + id + ", codigoISO=" + codigo_ISO + ", nombre=" + nombre + ", simbolo=" + simbolo + "]";
    }
    

 

    
}