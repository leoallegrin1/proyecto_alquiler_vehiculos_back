package Models;

import org.springframework.format.annotation.DateTimeFormat;

public class Vehiculos extends Vehiculo {
    public Vehiculo getVehiculo() {
        return Vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        Vehiculo = vehiculo;
    }
    public DateTimeFormat getFechaInicioAlq() {
        return FechaInicioAlq;
    }
    public void setFechaInicioAlq(DateTimeFormat fechaInicioAlq) {
        FechaInicioAlq = fechaInicioAlq;
    }
    public DateTimeFormat getFechaFinAlq() {
        return FechaFinAlq;
    }
    public void setFechaFinAlq(DateTimeFormat fechaFinAlq) {
        FechaFinAlq = fechaFinAlq;
    }
    private Vehiculo Vehiculo;
    private DateTimeFormat FechaInicioAlq;
    private DateTimeFormat FechaFinAlq;
}
