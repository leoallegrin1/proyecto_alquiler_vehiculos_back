package com.proyecto.proyecto_alquiler_vehiculos.Models;

import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public DateTimeFormat getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(DateTimeFormat fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCelular() {
        return Celular;
    }
    public void setCelular(String celular) {
        Celular = celular;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }


    
    public Cliente() {
    }



    public Cliente(String username, String password, DateTimeFormat fechaNacimiento, String dNI,
            String correoElectronico, String nombre, String apellido, String celular, String nacionalidad) {
        Username = username;
        Password = password;
        FechaNacimiento = fechaNacimiento;
        DNI = dNI;
        CorreoElectronico = correoElectronico;
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
        Nacionalidad = nacionalidad;
    }



    private String Username;
    private String Password;
    private DateTimeFormat FechaNacimiento;
    private String DNI;
    private String CorreoElectronico;
    private String Nombre;
    private String Apellido;
    private String Celular;
    private String Nacionalidad;
}
