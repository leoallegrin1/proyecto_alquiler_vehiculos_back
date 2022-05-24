package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;


import com.proyecto.proyecto_alquiler_vehiculos.Models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RentalsVenado")
@CrossOrigin(origins = "http://localhost:4200")
public class AlquilerController {

    @Autowired
	private I_Vehiculo IVehiculos;

    @GetMapping("/login")
	public String Login(@RequestParam(value = "name", defaultValue = "Leo") String name) {

		return String.format("Bienvenido!");
	}

	@GetMapping("/vehiculos")
	public List<Vehiculo> listarVehiculos(){
        
		return IVehiculos.Vehiculos();
	}

    

    
}
