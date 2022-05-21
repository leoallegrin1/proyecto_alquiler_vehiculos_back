
package com.proyecto.proyecto_alquiler_vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Models.Vehiculo;

@SpringBootApplication
@RestController
public class ProyectoAlquilerVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoAlquilerVehiculosApplication.class, args);
	}

	@GetMapping("/login")
	public String Login(@RequestParam(value = "name", defaultValue = "Leo") String name) {

		return String.format("Bienvenido %s!");
	}

	@GetMapping("/registrarVehiculo")
	public Vehiculo RegistrarVehiculo(int cod) {

		Vehiculo toyota1 = new Vehiculo();
		Vehiculo toyota2 = new Vehiculo();
		Vehiculo toyota3 = new Vehiculo();
		Vehiculo peugeot = new Vehiculo();
		Vehiculo chevrolet = new Vehiculo();
		Vehiculo[] vehiculos = new Vehiculo[5];

		Vehiculo toyotas[] = new Vehiculo[3];
		toyotas[0] = toyota1;
		toyotas[0].setID(1);
		toyotas[0].setModelo("Hilux");
		toyotas[0].setAnio("2020");
		toyotas[0].setTamanio("Grande");
		toyotas[0].setCategoria("Pick-up");

		toyotas[1] = toyota2;
		toyotas[1].setID(2);
		toyotas[1].setModelo("Corolla");
		toyotas[1].setAnio("2021");
		toyotas[1].setTamanio("Mediano");
		toyotas[1].setCategoria("Automovil");

		toyotas[2] = toyota3;
		toyotas[2].setID(3);
		toyotas[2].setModelo("Etios");
		toyotas[2].setAnio("2019");
		toyotas[2].setTamanio("Pequeño");
		toyotas[2].setCategoria("Automovil");

		peugeot.setID(4);
		peugeot.setModelo("Partner");
		peugeot.setAnio("2020");
		peugeot.setTamanio("Mediano");
		peugeot.setCategoria("Utilitario");

		chevrolet.setID(5);
		chevrolet.setModelo("Spin");
		chevrolet.setAnio("2018");
		chevrolet.setTamanio("Grande");
		chevrolet.setCategoria("Automovil");

		vehiculos[0] = toyota1;
		vehiculos[1] = toyota2;
		vehiculos[2] = toyota3;
		vehiculos[3] = peugeot;
		vehiculos[4] = chevrolet;

		return vehiculos[cod];
	}

	@GetMapping("/buscarVehiculo")
	public String buscarVehiculo() {
		int cod = 3;

		Vehiculo Vehiculo_seleccionado = new Vehiculo();
		Vehiculo_seleccionado = RegistrarVehiculo(cod);

		return String.format("Vehiculo seleccionado: " + Vehiculo_seleccionado.getModelo() +
				Vehiculo_seleccionado.getAnio() +
				Vehiculo_seleccionado.getTamanio() + Vehiculo_seleccionado.getCategoria());
	}
}
