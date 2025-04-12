package com.example.parcial.Controller;


import com.example.parcial.Model.Visitante;
import com.example.parcial.Services.servicesVisitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitantesController  {

    @Autowired
    private servicesVisitante servicesVisitante;

    @PostMapping("/guardar")
    public Visitante guardar(@RequestBody Visitante visitante) {
        return servicesVisitante.guardar(visitante);
    }

    @GetMapping("/listar")
    public List<Visitante> listar() {
        return servicesVisitante.listar();
    }

    @PutMapping("/{id}")
    public Visitante actualizarVisitante(@PathVariable int id, @RequestBody Visitante visitante) {
        return servicesVisitante.actualizar(id, visitante);
    }

    @DeleteMapping("/{id}")
    public void eliminarVisitante(@PathVariable int id) {
        servicesVisitante.eliminar(id);
    }

}
