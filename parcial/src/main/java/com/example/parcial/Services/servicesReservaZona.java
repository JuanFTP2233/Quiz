package com.example.parcial.Services;

import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Repository.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicesReservaZona {

    @Autowired
    private ReservaZonaRepository reservaZonaRepository;

    public ReservaZona guardar(ReservaZona reserva) {
        return reservaZonaRepository.save(reserva);
    }

    public List<ReservaZona> listar() {
        return reservaZonaRepository.findAll();
    }

    public ReservaZona actualizar(int id, ReservaZona reserva) {
        Optional<ReservaZona> reservaExistente = reservaZonaRepository.findById(id);

        if (reservaExistente.isPresent()) {
            ReservaZona reservaActualizada = reservaExistente.get();
            reservaActualizada.setFecha(reserva.getFecha());
            reservaActualizada.setHoraInicio(reserva.getHoraInicio());
            reservaActualizada.setZona(reserva.getZona());
            return reservaZonaRepository.save(reservaActualizada);
        } else {
            return null;
        }
    }

    public void eliminar(int id) {
        if (reservaZonaRepository.existsById(id)) {
            reservaZonaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Reserva no encontrada");
        }
    }
}
