package com.divisas.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Class.Monedas;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Repository.MonedaRepository;

import jakarta.transaction.Transactional;

@Service
public class MonedaService {
    private final MonedaRepository monedaRepository;


  @Autowired
    public MonedaService(MonedaRepository monedaRepository ){
        this.monedaRepository = monedaRepository;
    }


     public Monedas guardarMoneda(Monedas moneda){
        return monedaRepository.save(moneda);
    }

    @Transactional 
    public List<Monedas> obtenerTodasMonedas() {
        return monedaRepository.findAll();
    }

    @Transactional
    public List<Monedas> getMonedaPorNombre(String nombre) {

        return monedaRepository.findByNombre(nombre);
    }

  
    public Monedas obtenerMonedaPorId(Long id) {
        return monedaRepository.findById(id).orElse(null);
    }

    public List<Monedas> obtenerMonedasPorNombre(String nombre) {
        return monedaRepository.findByNombre(nombre);
    }

    public void eliminarMonedaPorId(Long id) {
        monedaRepository.deleteById(id);
    }

    public Monedas actualizarMoneda(Monedas moneda) {
        return monedaRepository.save(moneda);
    }
}

