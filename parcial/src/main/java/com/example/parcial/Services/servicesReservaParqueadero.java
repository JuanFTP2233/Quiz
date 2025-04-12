package com.example.parcial.Services;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Repository.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicesReservaParqueadero {

    @Autowired
    private ReservaParqueaderoRepository reservaParqueaderoRepository;

    public ReservaParqueadero guardar(ReservaParqueadero reserva) {
        return reservaParqueaderoRepository.save(reserva);
    }

    public List<ReservaParqueadero> listar() {
        return reservaParqueaderoRepository.findAll();
    }

    public ReservaParqueadero actualizar(int id, ReservaParqueadero reserva) {
        Optional<ReservaParqueadero> reservaExistente = reservaParqueaderoRepository.findById(id);

        if (reservaExistente.isPresent()) {
            ReservaParqueadero reservaActualizada = reservaExistente.get();
            reservaActualizada.setFecha(reserva.getFecha());
            reservaActualizada.setHoraInicio(reserva.getHoraInicio());
            return reservaParqueaderoRepository.save(reservaActualizada);
        } else {
            return null;
        }
    }

    public void eliminar(int id) {
        if (reservaParqueaderoRepository.existsById(id)) {
            reservaParqueaderoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Reserva no encontrada");
        }
    }
}
