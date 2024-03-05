package com.divisas.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisas.main.Class.HistorialTransaccion;
import com.divisas.main.Service.HistorialTransaccionService;

@RestController
@RequestMapping("/api/historial-transacciones")
public class HistorialTransaccionController {

    private final HistorialTransaccionService historialTransaccionService;

    @Autowired
    public HistorialTransaccionController(HistorialTransaccionService historialTransaccionService) {
        this.historialTransaccionService = historialTransaccionService;
    }

    @GetMapping
    public ResponseEntity<List<HistorialTransaccion>> getAllHistorialesTransaccion() {
        List<HistorialTransaccion> historialesTransaccion = historialTransaccionService.getAllHistorialesTransaccion();
        return new ResponseEntity<>(historialesTransaccion, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialTransaccion> getHistorialTransaccionPorId(@PathVariable("id") Long id) {
        HistorialTransaccion historialTransaccion = historialTransaccionService.getHistorialTransaccionPorId(id);
        if (historialTransaccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(historialTransaccion, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HistorialTransaccion> guardarHistorialTransaccion(@RequestBody HistorialTransaccion historialTransaccion) {
        HistorialTransaccion nuevoHistorialTransaccion = historialTransaccionService.guardarHistorialTransaccion(historialTransaccion);
        return new ResponseEntity<>(nuevoHistorialTransaccion, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHistorialTransaccion(@PathVariable("id") Long id) {
        HistorialTransaccion historialTransaccion = historialTransaccionService.getHistorialTransaccionPorId(id);
        if (historialTransaccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        historialTransaccionService.eliminarHistorialTransaccionPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PutMapping("/{id}")
public ResponseEntity<HistorialTransaccion> actualizarHistorialTransaccion(@PathVariable("id") Long id, @RequestBody HistorialTransaccion historialTransaccionActualizado) {
    // Verificar si el historial de transacción que se intenta actualizar existe
    HistorialTransaccion existente = historialTransaccionService.getHistorialTransaccionPorId(id);
    if (existente == null) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Establecer el ID del historialTransaccionActualizado para asegurar que se actualice el recurso correcto
    historialTransaccionActualizado.setId(id);

    // Llamar al servicio para actualizar el historial de transacción
    HistorialTransaccion historialTransaccionActualizadoResultante = historialTransaccionService.actualizarHistorialTransaccion(historialTransaccionActualizado);

    // Verificar si la actualización fue exitosa
    if (historialTransaccionActualizadoResultante != null) {
        return new ResponseEntity<>(historialTransaccionActualizadoResultante, HttpStatus.OK);
    } else {
        // Si la actualización falla por alguna razón, devolver un código de estado 500 (Error interno del servidor)
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}



}
