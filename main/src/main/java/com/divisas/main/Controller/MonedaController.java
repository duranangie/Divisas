package com.divisas.main.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisas.main.Class.Monedas;
import com.divisas.main.Service.MonedaService;

@RestController
@RequestMapping("/api/monedas")
public class MonedaController {

    private final MonedaService monedaService;

    @Autowired
    public MonedaController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @GetMapping
    public ResponseEntity<List<Monedas>> obtenerTodasMonedas() {
        List<Monedas> monedas = monedaService.obtenerTodasMonedas();
        return new ResponseEntity<>(monedas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monedas> obtenerMonedaPorId(@PathVariable("id") Long id) {
        Monedas moneda = monedaService.obtenerMonedaPorId(id);
        if (moneda == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(moneda, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Monedas> guardarMoneda(@RequestBody Monedas moneda) {
        Monedas nuevaMoneda = monedaService.guardarMoneda(moneda);
        return new ResponseEntity<>(nuevaMoneda, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monedas> actualizarMoneda(@PathVariable("id") Long id, @RequestBody Monedas moneda) {
        Monedas monedaExistente = monedaService.obtenerMonedaPorId(id);
        if (monedaExistente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        moneda.setId(id);
        Monedas monedaActualizada = monedaService.actualizarMoneda(moneda);
        return new ResponseEntity<>(monedaActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMoneda(@PathVariable("id") Long id) {
        Monedas moneda = monedaService.obtenerMonedaPorId(id);
        if (moneda == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        monedaService.eliminarMonedaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
