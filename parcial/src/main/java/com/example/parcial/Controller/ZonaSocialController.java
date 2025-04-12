package com.example.parcial.Controller;


import com.example.parcial.Model.ZonaSocial;
import com.example.parcial.Services.servicesZonaSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonas-sociales")
public class ZonaSocialController {

    @Autowired
    private servicesZonaSocial servicesZonaSocial;

    @PostMapping("/guardar")
    public ZonaSocial guardar(@RequestBody ZonaSocial zonaSocial) {
        return servicesZonaSocial.guardar(zonaSocial);
    }

    @GetMapping("/listar")
    public List<ZonaSocial> listar() {
        return servicesZonaSocial.listar();
    }

    @PutMapping("/{id}")
    public ZonaSocial actualizarZonaSocial(@PathVariable int id, @RequestBody ZonaSocial zonaSocial) {
        return servicesZonaSocial.actualizar(id, zonaSocial);
    }

    @DeleteMapping("/{id}")
    public void eliminarZonaSocial(@PathVariable int id) {
        servicesZonaSocial.eliminar(id);
    }

}
