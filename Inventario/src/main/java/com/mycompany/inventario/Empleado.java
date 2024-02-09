package com.mycompany.inventario;

public class Empleado extends Persona{
    private String cargoEmpleado, pass;
    private double salario;

    public Empleado(String nombre, String email, String telefono, String cedula, String cargoEmpleado, String pass, double salario) {
        super(nombre, email, telefono, cedula);
        this.cargoEmpleado = cargoEmpleado;
        this.pass = pass;
        this.salario = salario;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
