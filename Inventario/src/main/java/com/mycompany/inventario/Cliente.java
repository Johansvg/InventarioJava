package com.mycompany.inventario;

public class Cliente extends Persona{
    
    private String direccion;
    
    public Cliente(String nombre, String email, String telefono, String cedula, String direccion) {
        super(nombre, email, telefono, cedula);
        this.direccion = direccion;
    }

    public Cliente(String nombre, String email, String telefono, String cedula) {
        super(nombre, email, telefono, cedula);
        this.direccion = "desconocida";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
