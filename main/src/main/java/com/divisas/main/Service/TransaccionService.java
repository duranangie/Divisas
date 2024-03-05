package com.divisas.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.divisas.main.Class.Transaccion;
import com.divisas.main.Repository.TransaccionRepository;

import jakarta.transaction.Transactional;

@Service
public class TransaccionService {
    private final TransaccionRepository transaccionRepository;

    @Autowired
    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    @Transactional
    public Transaccion guardarTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @Transactional
    public List<Transaccion> getAllTransacciones() {
        return transaccionRepository.findAll();
    }

    @Transactional
    public Transaccion getTransaccionPorId(Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    @Transactional
    public void eliminarTransaccionPorId(Long id) {
        transaccionRepository.deleteById(id);
    }


    @Transactional
public ResponseEntity<Transaccion> actualizarTransaccion(Long id, Transaccion transaccionActualizada) {
    Transaccion transaccionExistente = transaccionRepository.findById(id).orElse(null);
    if (transaccionExistente != null) {
        transaccionExistente.setCantidadBase(transaccionActualizada.getCantidadBase());
        transaccionExistente.setCantidadDestino(transaccionActualizada.getCantidadDestino());
        transaccionExistente.setTasaCambioUtilizado(transaccionActualizada.getTasaCambioUtilizado());

        Transaccion transaccionActualizadaDB = transaccionRepository.save(transaccionExistente);
        return new ResponseEntity<>(transaccionActualizadaDB, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

}
