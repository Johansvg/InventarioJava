package com.mycompany.inventario;

public class Inventario {
    
    public static void main(String[] args){
        ProcessEmpleado objEmp = new ProcessEmpleado();
        Connection cn = new Connection();
        java.sql.Connection con = cn.conexionBD();
        String email = "example@unal.edu.co";
        String pass = "Cumple2016";
        boolean res = objEmp.validarCredenciales(con, email, pass);
        System.out.println("Credenciales: " + res);
    }
}
