package com.divisas.main.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.divisas.main.Class.Pais;

public interface PaisRepository extends  JpaRepository<Pais,Long>{
        List<Pais> findByNombre(String nombre);
}
 