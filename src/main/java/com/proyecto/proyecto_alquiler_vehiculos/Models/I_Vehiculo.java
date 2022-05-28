package com.proyecto.proyecto_alquiler_vehiculos.Models;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

@Repository
public class I_Vehiculo {

    public List<Vehiculo> Vehiculos() {
        
        List<Vehiculo> automoviles = new ArrayList<Vehiculo>();
        automoviles.add(new Vehiculo(1, "Toyota", "Corolla", "2022",
         "Mediano", "Automovil", true, 6500));

        automoviles.add(new Vehiculo(2, "Toyota", "Etios", "2021",
         "chico","Automovil",false, 5000));

        automoviles.add(new Vehiculo(3, "Toyota", "Hilux", "2019",
         "Grande","Pick-up",true,9000));

        automoviles.add(new Vehiculo(4, "Peugeot", "Partner", "2020", 
        "Mediano", "Utilitario", true, 6500)); 

        automoviles.add(new Vehiculo(5, "Chevrolet", "Spin", "2018", "Grande", "Automovil", true, 7500));
        
        return automoviles;
    }
}
