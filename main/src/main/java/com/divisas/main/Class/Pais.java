package com.divisas.main.Class;

import jakarta.persistence.*;

@Entity
@Table(name="pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String codigo_ISO;

    @OneToOne(mappedBy = "pais", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Cliente cliente;

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

  
 
    @Override
    public String toString() {
        return "Pais {id=" + id + ", nombre=" + nombre + ", codigo_ISO=" + codigo_ISO + "}";
    }

    
    
}
