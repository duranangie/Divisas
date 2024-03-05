package com.divisas.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisas.main.Class.HistorialTransaccion;
import com.divisas.main.Repository.HistorialTransaccionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HistorialTransaccionService {

    @Autowired
    private HistorialTransaccionRepository historialTransaccionRepository;

    public List<HistorialTransaccion> getAllHistorialesTransaccion() {
        return historialTransaccionRepository.findAll();
    }

    public HistorialTransaccion getHistorialTransaccionPorId(Long id) {
        return historialTransaccionRepository.findById(id).orElse(null);
    }

    public void eliminarHistorialTransaccionPorId(Long id) {
        historialTransaccionRepository.deleteById(id);
    }

    public HistorialTransaccion guardarHistorialTransaccion(HistorialTransaccion historialTransaccion) {
       return historialTransaccionRepository.save(historialTransaccion);
    }


    @Transactional
    public HistorialTransaccion actualizarHistorialTransaccion(HistorialTransaccion historialTransaccion) {
        // Verificar si el historial de transacción existe en la base de datos
        HistorialTransaccion existente = historialTransaccionRepository.findById(historialTransaccion.getId()).orElse(null);
        if (existente != null) {
            // Actualizar solo si existe
            return historialTransaccionRepository.save(historialTransaccion);
        } else {
            // Si no existe, devuelve nulo para indicar una actualización fallida
            return null;
        }
    }
}