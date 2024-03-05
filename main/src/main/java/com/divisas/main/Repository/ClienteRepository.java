package com.divisas.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.divisas.main.Class.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    List<Cliente>findByNombre(String nombre);


      @Query("SELECT c FROM Cliente c WHERE c.pais.nombre = :nombrePais")
    List<Cliente> findByNombrePais(@Param("nombrePais") String nombrePais);
    


    @Query("SELECT c FROM Cliente c WHERE c.nombre LIKE %:keyword%")
    List<Cliente> findByNombreContaining(@Param("keyword") String keyword);
    
}
