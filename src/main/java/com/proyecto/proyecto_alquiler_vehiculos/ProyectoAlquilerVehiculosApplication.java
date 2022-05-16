
package com.proyecto.proyecto_alquiler_vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProyectoAlquilerVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoAlquilerVehiculosApplication.class, args);
	}

	@GetMapping("/registrar")
	public String RegistrarVehiculo(@RequestParam(value = "name", defaultValue = "Leo") String name) {
		return String.format("Bienvenido %s!", name);
	}

	@GetMapping("/contacto")
	public void Contacto() {
	}
}
