package com.divisas.main.Class;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;
    

@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "pais_id")
private Pais pais;

    


    @OneToMany(mappedBy = "cliente", cascade=CascadeType.ALL, orphanRemoval = true , fetch = FetchType.LAZY)  
    private List<Transaccion> transacciones = new ArrayList<>(); 

    @ManyToMany
    @JoinTable(
        name="ClienteMoneda",
        joinColumns = @JoinColumn(name="cliente_id"),
        inverseJoinColumns = @JoinColumn(name="moneda_id")
    )
    private List<Monedas> monedas;

     
    public Cliente(Long id, String nombre, String direccion, String correo, String telefono, Pais pais
          ) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.pais = pais;
      
    }




    public Cliente(){

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




    public String getDireccion() {
        return direccion;
    }




    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




    public String getCorreo() {
        return correo;
    }




    public void setCorreo(String correo) {
        this.correo = correo;
    }




    public String getTelefono() {
        return telefono;
    }




    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




    public Pais getPais() {
        return pais;
    }




    public void setPais(Pais pais) {
        this.pais = pais;
    }




     public List<Monedas> getMonedas() {
        return monedas;
    }







    @Override
    public String toString() {
        return "Cliente {id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo
                + ", telefono=" + telefono + ", pais=" + pais + "}";
    }

    

   

}