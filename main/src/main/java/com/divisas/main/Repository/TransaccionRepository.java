package com.divisas.main.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.divisas.main.Class.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion,Long> {
    
}
