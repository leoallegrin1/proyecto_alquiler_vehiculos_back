import { Vehiculo } from './../vehiculo';
import { Component, OnInit } from '@angular/core';
import { VehiculoService } from '../vehiculo.service';

@Component({
  selector: 'app-lista-vehiculos',
  templateUrl: './lista-vehiculos.component.html',
  styleUrls: ['./lista-vehiculos.component.css']
})
export class ListaVehiculosComponent implements OnInit {

  vehiculos:Vehiculo[];

  constructor(private vehiculoServicio:VehiculoService) { }

  ngOnInit(): void {
    this.obtenerVehiculos();
  }

  private obtenerVehiculos(){
    this.vehiculoServicio.obtenerListaVehiculos()
    .subscribe(dato => {
      this.vehiculos = dato;
    })
  }

}
