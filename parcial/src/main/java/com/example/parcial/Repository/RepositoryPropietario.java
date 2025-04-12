package com.example.parcial.Repository;


import com.example.parcial.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPropietario extends JpaRepository<Propietario, Integer> {
}
