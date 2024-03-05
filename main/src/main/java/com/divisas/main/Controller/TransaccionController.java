package com.divisas.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisas.main.Class.Transaccion;
import com.divisas.main.Service.TransaccionService;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionController {

    private final TransaccionService transaccionService;

    @Autowired
    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping
    public ResponseEntity<List<Transaccion>> getAllTransacciones() {
        List<Transaccion> transacciones = transaccionService.getAllTransacciones();
        return new ResponseEntity<>(transacciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaccion> getTransaccionPorId(@PathVariable("id") Long id) {
        Transaccion transaccion = transaccionService.getTransaccionPorId(id);
        if (transaccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(transaccion, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Transaccion> guardarTransaccion(@RequestBody Transaccion transaccion) {
        Transaccion nuevaTransaccion = transaccionService.guardarTransaccion(transaccion);
        return new ResponseEntity<>(nuevaTransaccion, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTransaccion(@PathVariable("id") Long id) {
        Transaccion transaccion = transaccionService.getTransaccionPorId(id);
        if (transaccion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        transaccionService.eliminarTransaccionPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
public ResponseEntity<Transaccion> actualizarTransaccion(@PathVariable("id") Long id, @RequestBody Transaccion transaccionActualizada) {
    ResponseEntity<Transaccion> response = transaccionService.actualizarTransaccion(id, transaccionActualizada);
    
    if (response.getStatusCode() == HttpStatus.OK) {
        return response;
    } else {
        return new ResponseEntity<>(response.getStatusCode());
    }
}

}
