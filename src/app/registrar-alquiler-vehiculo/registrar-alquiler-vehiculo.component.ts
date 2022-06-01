import { Vehiculo } from './../vehiculo';
import { Component, OnInit } from '@angular/core';
import { VehiculoService } from '../vehiculo.service';

@Component({
  selector: 'app-registrar-alquiler-vehiculo',
  templateUrl: './registrar-alquiler-vehiculo.component.html',
  styleUrls: ['./registrar-alquiler-vehiculo.component.css']
})
export class RegistrarAlquilerVehiculoComponent implements OnInit {

  vehiculos : Vehiculo;
  constructor(private vehiculoServicio:VehiculoService) { }

  ngOnInit(): void {
  }

  onSubmit(){

  }

  private mostrarVehiculos(){
    this.vehiculoServicio.obtenerVehiculo()
    .subscribe(dato => {
      this.vehiculos = dato;
    })
  }

}


