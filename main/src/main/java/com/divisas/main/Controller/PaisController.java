package com.divisas.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.divisas.main.Class.Pais;
import com.divisas.main.Service.PaisService;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    private final PaisService paisService;

    @Autowired
    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @PostMapping("/guardar")
    public Pais guardarPais(@RequestBody Pais pais) {
        return paisService.guardarPais(pais);
    }

    @GetMapping("/todos")
    public List<Pais> obtenerTodosLosPaises() {
        return paisService.getAllPais();
    }

    @GetMapping("/{id}")
    public Pais obtenerPaisPorId(@PathVariable Long id) {
        return paisService.gePaisPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Pais> obtenerPaisesPorNombre(@PathVariable String nombre) {
        return paisService.getPaisPorNombre(nombre);
    }

    @DeleteMapping("/{id}")
    public void eliminarPaisPorId(@PathVariable Long id) {
        paisService.eliminarPaisPorId(id);
    }


    @PutMapping("/actualizar/{id}")
    public Pais actualizarPais(@PathVariable Long id, @RequestBody Pais pais) {
        pais.setId(id); 
    return paisService.actualizarPais(pais);
}

}
