package com.divisas.main.Repository;
import com.divisas.main.Clases.Transaccion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion,Long> {
    
}
