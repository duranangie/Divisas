package com.divisas.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Class.Pais;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Repository.PaisRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService  {
     private final ClienteRepository clienteRepository;




    @Autowired
    public ClienteService(ClienteRepository clieteRepository ){
        this.clienteRepository = clieteRepository;
    }


     public Cliente guardarPais(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional 
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    @Transactional
    public List<Cliente> getClientePorNombre(String nombre) {

        return clienteRepository.findByNombre(nombre);
    }

    @Transactional
    public Cliente getClientePorId(Long id){
        return clienteRepository.findById(id).orElse(null); //pendie

    }
    @Transactional
    public void eliminarClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

    @Transactional
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> obtenerClientesPorNombrePais(String nombrePais) {
        return clienteRepository.findByNombrePais(nombrePais);
    }

}
