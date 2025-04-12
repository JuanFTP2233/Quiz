package com.example.parcial.Controller;
import com.example.parcial.Model.ReservaZona;
import com.example.parcial.Services.servicesReservaZona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas-zona")
public class ReservaZonaController {

    @Autowired
    private servicesReservaZona reservaZonaService;

    @PostMapping("/guardar")
    public ReservaZona guardar(@RequestBody ReservaZona reserva) {
        return reservaZonaService.guardar(reserva);
    }

    @GetMapping("/listar")
    public List<ReservaZona> listar() {
        return reservaZonaService.listar();
    }

    @PutMapping("/{id}")
    public ReservaZona actualizarReservaZona(@PathVariable int id, @RequestBody ReservaZona reserva) {
        return reservaZonaService.actualizar(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminarReservaZona(@PathVariable int id) {
        reservaZonaService.eliminar(id);
    }

}
