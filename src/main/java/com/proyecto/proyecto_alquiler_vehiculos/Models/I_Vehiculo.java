package com.proyecto.proyecto_alquiler_vehiculos.Models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class I_Vehiculo {

    public List<Vehiculo> Vehiculos() {
        boolean exito = false;
        int identificadores;
        List<Vehiculo> automoviles = new ArrayList<Vehiculo>();
        automoviles.add(new Vehiculo(1, "Toyota", "Corolla", "2022",
         "Mediano", "Automovil", true));

        automoviles.add(new Vehiculo(2, "Toyota", "Etios", "2021",
         "chico","Automovil",false));

        automoviles.add(new Vehiculo(3, "Toyota", "Camry", "2019",
         "Mediano","Automovil",true));

        for(Vehiculo autos :automoviles){
            if(autos.Disponible == true){
                identificadores = autos.ID;
                exito = true;

            }else{
                
                exito = false;
            }
        }
        if(exito){
            return automoviles;
        }else{
            return automoviles;
        }
    }
}