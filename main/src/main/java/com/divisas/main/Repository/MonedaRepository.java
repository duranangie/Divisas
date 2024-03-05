package com.divisas.main.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisas.main.Class.Monedas;

public interface MonedaRepository extends JpaRepository<Monedas,Long> {
        List<Monedas> findByNombre(String nombre);
    
 
    
}
