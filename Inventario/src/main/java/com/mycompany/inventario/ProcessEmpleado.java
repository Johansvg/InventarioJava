package com.mycompany.inventario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcessEmpleado {
    
    public void crearEmpleado(Connection cn, String cedula, int idTienda, String nombre, String email, String telefono, String cargo, String pass, float salario){
        String sql = "INSERT INTO empleado (cedulaEmp, idTiendaEmp, nombreEmp, emailEmp, telefonoEmp, cargoEmp, contraEmp, salarioEmp) VALUES " +
                "(" + "'" + cedula +"'," + idTienda + ",'" + nombre +
                "'," + "'" + email + "'," + "'" + telefono + "'," +
                "'" + cargo + "'," + "'" + pass + "'," + salario + ");";
        System.out.println(sql);
        Statement stmt;
        try {
            stmt = cn.createStatement();
            int filasAfectadas = stmt.executeUpdate(sql);
            System.out.println("Row Affected: " + filasAfectadas);
            System.out.println("Cliente creado exitosamente !!!!");
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("Empleado no ha sido creado correctamente :(");
        }
    }

    public String buscarCredencialesEmp(Connection cn, String email){
        //ArrayList credenciales = new ArrayList<String>(2);
        String pass = "";
        String sql = "SELECT * FROM empleado WHERE emailEmp = '" + email + "';";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()) {
                pass = rs.getString("contraEmp");
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return pass;
    }

    public boolean validarCredenciales(Connection cn, String email, String pass){
        String contra = buscarCredencialesEmp(cn, email);
        if (contra.isEmpty() || !contra.contentEquals(pass)){
            return false;
        }
        return true;
    }
}
