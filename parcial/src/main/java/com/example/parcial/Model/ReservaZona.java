package com.example.parcial.Model;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Model.Visitante;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
public class ReservaZona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    private LocalDate fecha;
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "idZona")
    private ZonaSocial zona;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

    public ReservaZona() {
    }

    public ReservaZona(int idReserva, LocalDate fecha, LocalTime horaInicio, ZonaSocial zona, Propietario propietario) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.zona = zona;
        this.propietario = propietario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ZonaSocial getZona() {
        return zona;
    }

    public void setZona(ZonaSocial zona) {
        this.zona = zona;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "ReservaZona{" +
                "idReserva=" + idReserva +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", zona=" + zona +
                ", propietario=" + propietario +
                '}';
    }
}