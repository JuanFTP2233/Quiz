package com.example.parcial.Repository;
import com.example.parcial.Model.ReservaParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaParqueaderoRepository extends JpaRepository<ReservaParqueadero, Integer> {
}
