package com.example.parcial.Repository;


import com.example.parcial.Model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitantesRepository extends JpaRepository<Visitante, Integer> {
}

