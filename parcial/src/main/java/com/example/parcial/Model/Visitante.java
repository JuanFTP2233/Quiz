package com.example.parcial.Model;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Model.Visitante;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisitante;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

    public Visitante() {
    }

    public Visitante(int idVisitante, String nombre, String cedula, String telefono, String correo, Propietario propietario) {
        this.idVisitante = idVisitante;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.propietario = propietario;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "idVisitante=" + idVisitante +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", propietario=" + propietario +
                '}';
    }
}