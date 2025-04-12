package com.example.parcial.Controller;

import com.example.parcial.Model.Propietario;
import com.example.parcial.Repository.RepositoryPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

    @Autowired
    private RepositoryPropietario propietarioRepository;

    @GetMapping
    public List<Propietario> getAllPropietarios() {
        return propietarioRepository.findAll();
    }

    @PostMapping
    public Propietario createPropietario(@RequestBody Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    @PutMapping("/{id}")
    public Propietario actualizarPropietario(@PathVariable int id, @RequestBody Propietario propietario) {
        // Verificar si el propietario existe, y si no, retornar un error (o lanzar una excepción personalizada)
        return propietarioRepository.findById(id)
                .map(existingPropietario -> {
                    existingPropietario.setNombre(propietario.getNombre());
                    existingPropietario.setCedula(propietario.getCedula());
                    existingPropietario.setFechaVisita(propietario.getFechaVisita());
                    existingPropietario.setHoraEntrada(propietario.getHoraEntrada());
                    // Aquí también puedes actualizar las listas relacionadas si es necesario.
                    return propietarioRepository.save(existingPropietario);
                })
                .orElseThrow(() -> new RuntimeException("Propietario no encontrado"));
    }

    @DeleteMapping("/{id}")
    public void eliminarPropietario(@PathVariable int id) {
        propietarioRepository.deleteById(id);
    }

}
