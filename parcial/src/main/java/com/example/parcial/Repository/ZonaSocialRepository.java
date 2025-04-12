package com.example.parcial.Repository;


import com.example.parcial.Model.ZonaSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaSocialRepository extends JpaRepository<ZonaSocial, Integer> {


}
