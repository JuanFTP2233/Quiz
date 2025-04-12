package com.example.parcial.Services;

import com.example.parcial.Model.Propietario;
import com.example.parcial.Repository.RepositoryPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicesPropietario {

    @Autowired
    private RepositoryPropietario propietarioRepository;

    public Propietario guardar(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    public List<Propietario> listar() {
        return propietarioRepository.findAll();
    }
}