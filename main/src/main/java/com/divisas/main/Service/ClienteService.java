package com.divisas.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisas.main.Clases.Cliente;
import com.divisas.main.Clases.Pais;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Repository.PaisRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;



    @Transactional
    public Cliente guardarPais(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional 
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    @Transactional
    public Cliente getClientePorId(Long id){
        return clienteRepository.findById(id).orElse(null); //pendie

    }
    @Transactional
    public void eliminarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }
}
