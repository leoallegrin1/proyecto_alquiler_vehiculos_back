package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquilerController {
    @GetMapping("/registrar")
	public String RegistrarVehiculo(@RequestParam(value = "name", defaultValue = "Leo") String name) {
	return String.format("Bienvenido %s!", name);
	}

	@GetMapping("/contacto")
	public void Contacto(){
	}
    
}
