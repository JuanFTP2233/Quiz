package com.example.parcial.Services;

import com.example.parcial.Model.ZonaSocial;
import com.example.parcial.Repository.ZonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicesZonaSocial {

    @Autowired
    private ZonaSocialRepository zonaSocialRepository;

    public ZonaSocial guardar(ZonaSocial zonaSocial) {
        return zonaSocialRepository.save(zonaSocial);
    }

    public List<ZonaSocial> listar() {
        return zonaSocialRepository.findAll();
    }

    public ZonaSocial actualizar(int id, ZonaSocial zonaSocial) {
        Optional<ZonaSocial> zonaSocialExistente = zonaSocialRepository.findById(id);

        if (zonaSocialExistente.isPresent()) {
            ZonaSocial zonaSocialActualizada = zonaSocialExistente.get();
            zonaSocialActualizada.setNombre(zonaSocial.getNombre());
            zonaSocialActualizada.setUbicacion(zonaSocial.getUbicacion());
            zonaSocialActualizada.setCapacidad(zonaSocial.getCapacidad());
            return zonaSocialRepository.save(zonaSocialActualizada);
        } else {
            return null;
        }
    }

    public void eliminar(int id) {
        if (zonaSocialRepository.existsById(id)) {
            zonaSocialRepository.deleteById(id);
        } else {
            throw new RuntimeException("Zona Social no encontrada");
        }
    }
}
