import { Vehiculo } from './../vehiculo';
import { Component, OnInit} from '@angular/core';
import { VehiculoService } from '../vehiculo.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-registrar-alquiler-vehiculo',
  templateUrl: './registrar-alquiler-vehiculo.component.html',
  styleUrls: ['./registrar-alquiler-vehiculo.component.css']
})
export class RegistrarAlquilerVehiculoComponent implements OnInit {

  vehiculos : Vehiculo;

  constructor(private vehiculoServicio:VehiculoService, private _route:ActivatedRoute) { }

  ngOnInit() {
    let id = this._route.snapshot.paramMap.get('id');
    this.mostrarVehiculos(id!)
  }

  onSubmit(){

  }

  private mostrarVehiculos(cod: string){
    var codigo = parseInt(cod);
    this.vehiculoServicio.obtenerVehiculo(codigo)
    .subscribe(dato => {
      this.vehiculos = dato;
    })
  }

}


