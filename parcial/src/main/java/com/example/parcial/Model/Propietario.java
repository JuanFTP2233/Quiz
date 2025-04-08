package com.example.parcial.Model;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Model.Visitante;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPropietario;

    private String nombre;
    private String cedula;
    private LocalDate fechaVisita;
    private LocalTime horaEntrada;

    @OneToMany(mappedBy = "propietario")
    private List<Visitante> visitantes;

    @OneToMany(mappedBy = "propietario")
    private List<ReservaZona> reservasZona;

    @OneToMany(mappedBy = "propietario")
    private List<ReservaParqueadero> reservasParqueadero;

    public Propietario() {
    }

    public Propietario(int idPropietario, String nombre, String cedula, LocalDate fechaVisita, LocalTime horaEntrada, List<Visitante> visitantes, List<ReservaZona> reservasZona, List<ReservaParqueadero> reservasParqueadero) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaVisita = fechaVisita;
        this.horaEntrada = horaEntrada;
        this.visitantes = visitantes;
        this.reservasZona = reservasZona;
        this.reservasParqueadero = reservasParqueadero;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<ReservaZona> getReservasZona() {
        return reservasZona;
    }

    public void setReservasZona(List<ReservaZona> reservasZona) {
        this.reservasZona = reservasZona;
    }

    public List<ReservaParqueadero> getReservasParqueadero() {
        return reservasParqueadero;
    }

    public void setReservasParqueadero(List<ReservaParqueadero> reservasParqueadero) {
        this.reservasParqueadero = reservasParqueadero;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "idPropietario=" + idPropietario +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", horaEntrada=" + horaEntrada +
                ", visitantes=" + visitantes +
                ", reservasZona=" + reservasZona +
                ", reservasParqueadero=" + reservasParqueadero +
                '}';
    }
}