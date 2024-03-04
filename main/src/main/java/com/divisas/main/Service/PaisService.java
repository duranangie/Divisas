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
public class PaisService {

     @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PaisRepository paisRepository;




     @Transactional
    public Pais guardarDatosConPais(Pais pais, Cliente cliente){
        pais.setCliente(cliente);
        cliente.setPais(pais);
        
        paisRepository.save(pais);

        return pais;
    }


    @Transactional
    public List<Pais> getAllPais(){
        return paisRepository.findAll();
    }





    
}
