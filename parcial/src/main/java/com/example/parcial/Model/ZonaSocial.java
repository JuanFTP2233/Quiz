package com.example.parcial.Model;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Model.Visitante;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
public class ZonaSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZona;

    private String nombre;
    private int ubicacion;
    private int capacidad;

    @OneToMany(mappedBy = "zona")
    private List<ReservaZona> reservas;

    public ZonaSocial() {
    }

    public ZonaSocial(int idZona, String nombre, int ubicacion, int capacidad, List<ReservaZona> reservas) {
        this.idZona = idZona;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.reservas = reservas;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<ReservaZona> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaZona> reservas) {
        this.reservas = reservas;
    }
}