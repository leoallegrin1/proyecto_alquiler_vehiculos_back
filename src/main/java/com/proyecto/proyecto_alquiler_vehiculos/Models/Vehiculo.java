package com.proyecto.proyecto_alquiler_vehiculos.Models;

import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;


public class Vehiculo {
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getAnio() {
        return Anio;
    }
    public void setAnio(String anio) {
        Anio = anio;
    }
    public String getPatente() {
        return Patente;
    }
    public void setPatente(String patente) {
        Patente = patente;
    }
    public String getTamanio() {
        return Tamanio;
    }
    public void setTamanio(String tamanio) {
        Tamanio = tamanio;
    }
    public boolean isTransmision() {
        return Transmision;
    }
    public void setTransmision(boolean transmision) {
        Transmision = transmision;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public DecimalStyle getPrecio_Alquiler() {
        return Precio_Alquiler;
    }
    public void setPrecio_Alquiler(DecimalStyle precio_Alquiler) {
        Precio_Alquiler = precio_Alquiler;
    }
    public boolean isDisponible() {
        return Disponible;
    }
    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }
    public DateTimeFormatter getFechaInicioAlq() {
        return FechaInicioAlq;
    }
    public void setFechaInicioAlq(DateTimeFormatter fechaInicioAlq) {
        FechaInicioAlq = fechaInicioAlq;
    }
    public DateTimeFormatter getFechaFinAlq() {
        return FechaFinAlq;
    }
    public void setFechaFinAlq(DateTimeFormatter fechaFinAlq) {
        FechaFinAlq = fechaFinAlq;
    }
    public int getID() {
        return ID;
    }
    public void setID(int id) {
        ID = id;
    }

    public Vehiculo() {
    }



   
    public Vehiculo (int Id, String marca,String modelo, String anio,
     String tamanio, String categoria,Boolean disponible){
        ID = Id;
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
        Tamanio = tamanio;
        Categoria = categoria;
        Disponible = disponible;
    }



    public int ID;
    public String Marca;
    public String Modelo;
    public String Anio;
    public String Patente;
    public String Tamanio;
    public boolean Transmision;
    public String Categoria;
    public DecimalStyle Precio_Alquiler;
    public boolean Disponible;
    public DateTimeFormatter FechaInicioAlq;
    public DateTimeFormatter FechaFinAlq;
}
