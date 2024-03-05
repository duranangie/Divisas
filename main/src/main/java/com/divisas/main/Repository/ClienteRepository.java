package com.divisas.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divisas.main.Class.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    List<Cliente>findByNombre(String nombre);

    

    
}
