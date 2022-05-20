package Models;

import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;


public class Vehiculo {
    private String Marca;
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
    public void setAnio(String string) {
        Anio = string;
    }
    public String getPatente() {
        return Patente;
    }
    public void setPatente(String patente) {
        Patente = patente;
    }
    public int getCantPlazas() {
        return CantPlazas;
    }
    public void setCantPlazas(int cantPlazas) {
        CantPlazas = cantPlazas;
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
    private String Modelo;
    private String Anio;
    private String Patente;
    private int CantPlazas;
    private boolean Transmision;
    private String Categoria;
    private DecimalStyle Precio_Alquiler;
    private boolean Disponible;
    private DateTimeFormatter FechaInicioAlq;
    private DateTimeFormatter FechaFinAlq;

    
} 
