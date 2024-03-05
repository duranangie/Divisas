package com.divisas.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    private final ClienteService clienteService;
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteService clienteService,ClienteRepository clienteRepository) {
        this.clienteService = clienteService;
        this.clienteRepository = clienteRepository;
    }


    @GetMapping("/por-pais/{nombrePais}")
    public List<Cliente> obtenerClientesPorNombrePais(@PathVariable String nombrePais) {
        return clienteService.obtenerClientesPorNombrePais(nombrePais);
    }


    @GetMapping("/nombreContiene/{keyword}")
public List<Cliente> obtenerClientesPorNombreContiene(@PathVariable String keyword) {
    return clienteRepository.findByNombreContaining(keyword);
}



    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarPais(cliente);
    }

    @GetMapping("/todos")
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteService.getAllCliente();
    }

    @GetMapping("/{id}")
    public Cliente obtenerClientePorId(@PathVariable Long id) {
        return clienteService.getClientePorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Cliente> obtenerClientesPorNombre(@PathVariable String nombre) {
        return clienteService.getClientePorNombre(nombre);
    }

    @DeleteMapping("/{id}")
    public void eliminarClientePorId(@PathVariable Long id) {
        clienteService.eliminarClientePorId(id);
    }

    @PutMapping("/{id}")
public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteActualizado) {
    Cliente clienteExistente = clienteService.getClientePorId(id);
    if (clienteExistente != null) {
        clienteActualizado.setId(id); 
        return clienteService.actualizarCliente(clienteActualizado);
    } else {
    
        throw new RuntimeException("No se encontró ningún cliente con el ID: " + id);
    }



    
}
}

