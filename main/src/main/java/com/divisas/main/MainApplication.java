package com.divisas.main;

// import java.sql.Date;
// import java.sql.Time;
// import java.util.List;
// import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// import com.divisas.main.Class.Cliente;
// import com.divisas.main.Class.HistorialTransaccion;
// import com.divisas.main.Class.Monedas;
// import com.divisas.main.Class.Pais;
// import com.divisas.main.Class.Transaccion;
// import com.divisas.main.Service.ClienteMonedasService;
// import com.divisas.main.Service.ClienteService;
// import com.divisas.main.Service.HistorialTransaccionService;
// import com.divisas.main.Service.MonedaService;
// import com.divisas.main.Service.PaisService;
// import com.divisas.main.Service.TransaccionService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(MainApplication.class, args);
		// ClienteService clienteService = contexto.getBean(ClienteService.class);
		// PaisService paisService = contexto.getBean(PaisService.class);
		// MonedaService monedaService = contexto.getBean(MonedaService.class);

		// TransaccionService transaccionService = contexto.getBean(TransaccionService.class);
		// HistorialTransaccionService historialTransaccionService = contexto.getBean(HistorialTransaccionService.class);
		// ClienteMonedasService clienteMonedasService = contexto.getBean(ClienteMonedasService.class);



		// // crear Cliente
		// Pais pais = paisService.gePaisPorId(3L);
		// Cliente cliente = new Cliente();
		// cliente.setNombre("myles");
		// cliente.setCorreo("myles@gmail.com");
		// cliente.setDireccion("grecia 59th");
		// cliente.setTelefono("9999999");
		// cliente.setPais(pais);

		// clienteService.guardarPais(cliente);


		// Read leer pais
		
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

		// /*buscarPorNombre */
		// List<Cliente> clientePorNombre = clienteService.getClientePorNombre("keeley");
		// 	System.out.println("Clientes por nombre");
		// 	for(Cliente cliente : clientePorNombre){
		// 		System.out.println(cliente);
		// 	}

		// // // delete eliminar
		// Long clienteIdAEliminar = 5L; // ID del cliente que deseas eliminar
		// clienteService.eliminarClientePorId(clienteIdAEliminar);
		// System.out.println("Cliente con ID " + clienteIdAEliminar + " eliminado correctamente.");

         /*TABLA PAIS */
		
		// Crear pais

		// Pais pais = new Pais();
		// pais.setCodigo_ISO("9999");
		// pais.setNombre("Grecia");
		// paisService.guardarPais( pais);
		


		// List<Pais> pais = paisService.getAllPais();
		// System.out.println("Paises registrados "+ pais);


		// // update actualizar
		// Long PaisId = 1L;
		// //Long clienteId = 2L; // ID del cliente que deseas actualizar
        // Pais pais = paisService.gePaisPorId(PaisId);
		// //Cliente cliente = clienteService.getClientePorId(clienteId);

        // if (pais != null) {
        //     // Realizar los cambios en el cliente
        //     pais.setNombre("Colombia");
        //     pais.setCodigo_ISO("123456");

        //     // Guardar el cliente actualizado en la base de datos
        //     paisService.guardarPais(pais);
        //     System.out.println("Pais actualizado con éxito: " + pais);
        // } else {
        //     System.out.println("Pais con ID " + PaisId + " no encontrado.");
        // }

		// /*buscarPorNombre */
		// List<Pais> paisPorNombre = paisService.getPaisPorNombre("london");
		// 	System.out.println("Pais por nombre");
		// 	for(Pais pais : paisPorNombre){
		// 		System.out.println(pais);
		// 	}

		// // // delete eliminar
	// 	Long paisIdAEliminar = 2L; // ID 
	// 	paisService.eliminarPaisPorId(paisIdAEliminar);
	// 	System.out.println("Cliente con ID " + paisIdAEliminar + " eliminado correctamente.");
	
		

	/*Monedas */

	//Crear pais

		// Monedas moneda = new Monedas();
		// moneda.setCodigo_ISO("234");
		// moneda.setNombre("libra");
		// moneda.setSimbolo("L");
		// monedaService.guardarMoneda(moneda);
		


		// //listar

		
		// System.out.println("Todas las monedas:");
        // monedaService.obtenerTodasMonedas().forEach(System.out::println);



		// Long idMoneda = 1L; // Suponiendo que la primera moneda tiene ID 1
        // System.out.println("Moneda con ID " + idMoneda + ": " + monedaService.obtenerMonedaPorId(idMoneda).orElse(null));

        // // Actualizar una moneda
        // Monedas monedaExistente = monedaService.obtenerMonedaPorId(1L).orElse(null);
        // if (monedaExistente != null) {
        //     monedaExistente.setNombre("Euro");
        //     monedaService.actualizarMoneda(monedaExistente);
        //     System.out.println("Moneda actualizada: " + monedaExistente);
        // }

        // // Eliminar una moneda
        // Long idMonedaAEliminar = 2L; // Suponiendo que la segunda moneda tiene ID 2
        // monedaService.eliminarMonedaPorId(idMonedaAEliminar);
        // System.out.println("Moneda con ID " + idMonedaAEliminar + " eliminada.");

    //     // Obtener todas las monedas después de eliminar
    //     System.out.println("Todas las monedas después de eliminar:");
    //     monedaService.obtenerTodasMonedas().forEach(System.out::println);
    // }


	// /*TRANSACCIONES */

	//    Cliente cliente = clienteService.getClientePorId(4L);
	//    Monedas moneda = monedaService.obtenerMonedaPorId(3L);
	//    Transaccion nuevaTransaccion = new Transaccion();
    //     nuevaTransaccion.setCantidadBase(100.0);
    //     nuevaTransaccion.setCantidadDestino(200.0);
    //     nuevaTransaccion.setTasaCambioUtilizado(2.0);
    //     nuevaTransaccion.setFecha(new Date(2024-02-05));
    //     nuevaTransaccion.setHora(new Time(System.currentTimeMillis()));
	// 	nuevaTransaccion.setCliente(cliente);
	// 	nuevaTransaccion.setMonedasBase(moneda);
	// 	nuevaTransaccion.setMonedasDestino(moneda);



    //     // Aquí deberías establecer el cliente y las monedas base y destino según tu lógica de negocio

    //     transaccionService.guardarTransaccion(nuevaTransaccion);


	//  // Obtener todas las transacciones
	//  List<Transaccion> transacciones = transaccionService.getAllTransacciones();
	//  for (Transaccion transaccion : transacciones) {
	// 	 System.out.println(transaccion.toString());
	//  }

	//leerPorId
	//  Transaccion transaccionPorId = transaccionService.getTransaccionPorId(1L);
	//  System.out.println("Transacción por ID: " + transaccionPorId.toString());

	// //eliminar
	// transaccionService.eliminarTransaccionPorId(3L);
	// System.out.println("Transacción eliminada.");


	//    /*HISTORIAL */
	//     // Obtener un cliente y una moneda
        // Cliente cliente = clienteService.getClientePorId(4L);
        // Monedas moneda = monedaService.obtenerMonedaPorId(1L);

        // // Crear una nueva transacción
        // Transaccion nuevaTransaccion = new Transaccion();
        // nuevaTransaccion.setCantidadBase(100.0);
        // nuevaTransaccion.setCantidadDestino(200.0);
        // nuevaTransaccion.setTasaCambioUtilizado(2.0);
        // nuevaTransaccion.setFecha(new Date(2024-01-02));
        // nuevaTransaccion.setHora(new Time(System.currentTimeMillis()));
        // nuevaTransaccion.setCliente(cliente);
        // nuevaTransaccion.setMonedasBase(moneda);	
        // nuevaTransaccion.setMonedasDestino(moneda);

        // // Guardar la transacción
        // transaccionService.guardarTransaccion(nuevaTransaccion);

        // // Crear un nuevo historial de transacción
        // HistorialTransaccion historialTransaccion = new HistorialTransaccion();
        // historialTransaccion.setAccionRealizada("Creación de transacción");
        // historialTransaccion.setFecha(new Date(2024-01-02));
        // historialTransaccion.setHora(new Time(System.currentTimeMillis()));
        // historialTransaccion.setTransaccion(nuevaTransaccion);

        // // Guardar el historial de transacción
        // historialTransaccionService.guardarHistorialTransaccion(historialTransaccion);


	// System.out.println("Transacciones: " + transaccionService.getAllTransacciones());
	// System.out.println("Historiales de Transacciones: " + historialTransaccionService.getAllHistorialesTransaccion());


		/*cliente moneda preferida */


		// // Agregar moneda a un cliente
        // Long clienteId = 6L;
        // Long monedaId = 1L;
        // clienteMonedasService.agregarMonedaACliente(clienteId, monedaId);

        
        // // Quitar moneda de un cliente
        // clienteMonedasService.quitarMonedaDeCliente(6L, 1L);


	}
		}




