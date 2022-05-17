
package com.proyecto.proyecto_alquiler_vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Models.Cliente;
import Models.Vehiculo;
import Models.Vehiculos;

@SpringBootApplication
@RestController
public class ProyectoAlquilerVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoAlquilerVehiculosApplication.class, args);
	}

	@GetMapping("/registrar")
	public String RegistrarVehiculo(@RequestParam(value = "name", defaultValue = "Leo") String name) {
		Vehiculo bmw =  new Vehiculo();
		bmw.setAnio("25");
		

		Cliente carlos = new Cliente();
		carlos.setApellido("Memmo");

		Vehiculos bmws = new Vehiculos();
		bmws.setVehiculo(bmw); 

		return String.format("Bienvenido %s!", name + bmw.getAnio() + carlos.getApellido() + bmws.getVehiculo());
	}

	@GetMapping("/contacto")
	public void Contacto() {
	}
}
