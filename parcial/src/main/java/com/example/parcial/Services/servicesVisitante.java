package com.example.parcial.Services;

import com.example.parcial.Model.Visitante;
import com.example.parcial.Repository.VisitantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicesVisitante {

    @Autowired
    private VisitantesRepository visitanteRepository;

    public Visitante guardar(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    public List<Visitante> listar() {
        return visitanteRepository.findAll();
    }

    public Visitante actualizar(int id, Visitante visitante) {
        Optional<Visitante> visitanteExistente = visitanteRepository.findById(id);

        if (visitanteExistente.isPresent()) {
            Visitante visitanteActualizado = visitanteExistente.get();
            visitanteActualizado.setNombre(visitante.getNombre());
            visitanteActualizado.setCedula(visitante.getCedula());
            visitanteActualizado.setTelefono(visitante.getTelefono());
            visitanteActualizado.setCorreo(visitante.getCorreo());
            return visitanteRepository.save(visitanteActualizado);
        } else {
            return null;
        }
    }

    public void eliminar(int id) {
        if (visitanteRepository.existsById(id)) {
            visitanteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Visitante no encontrado");
        }
    }
}
