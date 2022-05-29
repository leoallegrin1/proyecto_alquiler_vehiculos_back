package com.proyecto.proyecto_alquiler_vehiculos.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class I_Vehiculo {

    public List<Vehiculo> Vehiculos() {
        
        List<Vehiculo> automoviles = new ArrayList<Vehiculo>();
        automoviles.add(new Vehiculo(1, "Toyota", "Corolla", "2022",
         "Mediano", "Automovil", true, 6500,"https://acroadtrip.blob.core.windows.net/catalogo-imagenes/l/RT_V_96df320cb38a4a258f20418527a3d5f7.jpg"));

        automoviles.add(new Vehiculo(2, "Toyota", "Etios", "2021",
         "chico","Automovil",false, 5000,"https://cdn.motor1.com/images/mgl/W81gLo/s3/220107-toyota5312.jpg" ));

        automoviles.add(new Vehiculo(3, "Toyota", "Hilux", "2019",
         "Grande","Pick-up",true,9000,"https://img.remediosdigitales.com/9171a3/toyota-hilux-2021-pick-up-precio-mexico_/450_1000.jpg"));

        automoviles.add(new Vehiculo(4, "Peugeot", "Partner", "2020", 
        "Mediano", "Utilitario", true, 6500, "https://cdn.motor1.com/images/mgl/QeWyjO/s1/lanzamiento-peugeot-partner-1.jpg" )); 

        automoviles.add(new Vehiculo(5, "Chevrolet", "Spin", "2018", "Grande", "Automovil", true, 7500, "https://www.autoweb.com.ar/wp-content/uploads/2021/01/FGD_7793-1024x683.jpg" ));
        
        //Con esto desaparecen los vehiculos que ya estan alquilados
        automoviles = automoviles
        .stream()
        .filter(x -> x.isDisponible())
        .collect(Collectors.toList());

        return automoviles;
    }
}
