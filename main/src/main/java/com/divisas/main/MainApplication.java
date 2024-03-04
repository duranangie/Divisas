package com.divisas.main;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.divisas.main.Clases.Cliente;
import com.divisas.main.Clases.Pais;
import com.divisas.main.Service.ClienteService;
import com.divisas.main.Service.PaisService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(MainApplication.class, args);
		ClienteService clienteService = contexto.getBean(ClienteService.class);
		PaisService paisService = contexto.getBean(PaisService.class);

		// // crear

		// Pais pais = new Pais();
		// pais.setCodigo_ISO("123456");
		// pais.setNombre("Londres");
		
		// Cliente cliente = new Cliente();
		// cliente.setNombre("keeley");
		// cliente.setCorreo("keeley@gmail.com");
		// cliente.setDireccion("london 59th");
		// cliente.setTelefono("66666666");

		// paisService.guardarDatosConPais(pais, cliente);

		// Read leer
		
		// List<Pais> pais = paisService.getAllPais();
		// System.out.println("Paises registrados "+ pais);

		// List<Cliente> cliente = clienteService.getAllCliente();
		// System.out.println("Clientes registrados "+ cliente);

		// update actualizar
		// Long clienteId = 4L; // ID del cliente que deseas actualizar
        // Cliente cliente = clienteService.getClientePorId(clienteId);

        // if (cliente != null) {
        //     // Realizar los cambios en el cliente
        //     cliente.setNombre("Matthe");
        //     cliente.setCorreo("Matt@gmail.com");

        //     // Guardar el cliente actualizado en la base de datos
        //     clienteService.guardarPais(cliente);
        //     System.out.println("Cliente actualizado con éxito: " + cliente);
        // } else {
        //     System.out.println("Cliente con ID " + clienteId + " no encontrado.");
        // }





		// delete eliminar
		Long clienteIdAEliminar = 5L; // ID del cliente que deseas eliminar
		clienteService.eliminarClientePorId(clienteIdAEliminar);
		System.out.println("Cliente con ID " + clienteIdAEliminar + " eliminado correctamente.");

		// buscarPorPais

	}

}
