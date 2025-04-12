package com.example.parcial.Controller;

import com.example.parcial.Model.ReservaParqueadero;
import com.example.parcial.Services.servicesReservaParqueadero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas-parqueadero")
public class ReservaParqueaderoController {

    @Autowired
    private servicesReservaParqueadero servicesReservaParqueadero;

    @PostMapping("/guardar")
    public ReservaParqueadero guardar(@RequestBody ReservaParqueadero reserva) {
        return servicesReservaParqueadero.guardar(reserva);
    }

    @GetMapping("/listar")
    public List<ReservaParqueadero> listar() {
        return servicesReservaParqueadero.listar();
    }

    @PutMapping("/{id}")
    public ReservaParqueadero actualizarReservaParqueadero(@PathVariable int id, @RequestBody ReservaParqueadero reserva) {
        return servicesReservaParqueadero.actualizar(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminarReservaParqueadero(@PathVariable int id) {
        servicesReservaParqueadero.eliminar(id);
    }

}
