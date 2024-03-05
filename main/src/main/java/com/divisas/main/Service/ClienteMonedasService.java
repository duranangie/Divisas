package com.divisas.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Class.Monedas;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Repository.MonedaRepository;


@Service
public class ClienteMonedasService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MonedaRepository monedasRepository;

    @Transactional
    public void agregarMonedaACliente(Long clienteId, Long monedaId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        Monedas moneda = monedasRepository.findById(monedaId).orElse(null);
        
        if (cliente != null && moneda != null) {
            cliente.getMonedas().add(moneda);
            clienteRepository.save(cliente);
        }
    }

    @Transactional
    public void quitarMonedaDeCliente(Long clienteId, Long monedaId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        Monedas moneda = monedasRepository.findById(monedaId).orElse(null);
        
        if (cliente != null && moneda != null) {
            cliente.getMonedas().remove(moneda);
            clienteRepository.save(cliente);
        }
    }
}
