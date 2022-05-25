import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehiculo } from './vehiculo';

@Injectable({
  providedIn: 'root'
})
export class VehiculoService {
  //URL backend listado de todos los vehiculos
  private baseUrl = "http://localhost:8080/RentalsVenado/vehiculos";

  constructor(private httpClient : HttpClient) { }

  //Este metodo devuleve los vehiculos
  obtenerListaVehiculos(): Observable<Vehiculo[]>{
    return this.httpClient.get<Vehiculo[]>(`${this.baseUrl}`);
  }
}
