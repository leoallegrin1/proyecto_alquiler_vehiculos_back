import { Vehiculo } from './../vehiculo';
import { Component, OnInit } from '@angular/core';
import { VehiculoService } from '../vehiculo.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-vehiculos',
  templateUrl: './lista-vehiculos.component.html',
  styleUrls: ['./lista-vehiculos.component.css'],
})
export class ListaVehiculosComponent implements OnInit {
  vehiculos: Vehiculo[];

  constructor(
    private router: Router,
    private vehiculoServicio: VehiculoService
  ) {}

  ngOnInit(): void {
    this.obtenerVehiculos();
  }

  private obtenerVehiculos() {
    this.vehiculoServicio.obtenerListaVehiculos().subscribe((dato) => {
      this.vehiculos = dato;
    });
  }

  SeleccionarVehiculo(vehiculo: Vehiculo) {
    let link = ['/registrar-alquiler', vehiculo.id-1];
    this.router.navigate(link);
  }
}
