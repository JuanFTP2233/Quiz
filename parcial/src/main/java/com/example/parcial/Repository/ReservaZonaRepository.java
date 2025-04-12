package com.example.parcial.Repository;

import com.example.parcial.Model.ReservaZona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaZonaRepository extends JpaRepository<ReservaZona, Integer> {
}
