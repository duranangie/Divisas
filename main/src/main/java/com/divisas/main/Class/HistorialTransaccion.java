package com.divisas.main.Class;
import java.sql.Time;
import java.util.Date;

import jakarta.persistence.*;

@Entity 
public class HistorialTransaccion {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;
    private String accionRealizada;

     @Temporal(TemporalType.DATE)


    private Date fecha;


    @Temporal(TemporalType.TIME)
    
    private Time hora;

    @ManyToOne
    @JoinColumn(name="transaccion_id")
    private Transaccion transaccion;

    public HistorialTransaccion(){

    }

    public HistorialTransaccion(Long id, String accionRealizada, Date fecha, Time hora, Transaccion transaccion) {
        this.id = id;
        this.accionRealizada = accionRealizada;
        this.fecha = fecha;
        this.hora = hora;
        this.transaccion = transaccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccionRealizada() {
        return accionRealizada;
    }

    public void setAccionRealizada(String accionRealizada) {
        this.accionRealizada = accionRealizada;
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
    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    @Override
    public String toString() {
        return "HistorialTransaccion [id=" + id + ", accionRealizada=" + accionRealizada + ", fecha=" + fecha
                + ", hora=" + hora + ", transaccion=" + transaccion + "]";
    }

    
    


}
