package com.divisas.main.Service;

import java.util.List;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Class.Pais;

public interface Implementacion  {

    /*Cliente */
    List<Cliente> getAllCliente();
    Cliente guardarPais (Cliente cliente);
    Cliente getClientePorId (Cliente cliente);
    void eliminarClientePorId(Long id);
    Cliente updateCliente(Cliente cliente);

    /*Pais */
    List<Pais> getAllPais();
    Pais guardarDatosConPais (Pais pais);
    Pais getClientePorId(Pais pais);
    void eliminarPaisId(Long id);
    Pais updatePais(Pais pais);


    /* */

   


    
    

    
}
