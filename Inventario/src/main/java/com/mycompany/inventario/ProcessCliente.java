package com.mycompany.inventario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ProcessCliente {
    
    public void crearCliente(Connection cn, String nombre, String email, String telefono, String cedula, String direccion){
        String sql = "INSERT INTO cliente (nombreCli, emailCli, telefonoCli, cedulaCli, direccionCli) VALUES (" + "'" + nombre + "'," + "'" + email + "'," + "'" + telefono + "'," + "'" + cedula + "'," + "'" + direccion + "');";
        Statement stmt;
        try {
            stmt = cn.createStatement();
            int filasAfectadas = stmt.executeUpdate(sql);
            System.out.println("Row Affected: " + filasAfectadas);
            System.out.println("Cliente creado exitosamente !!!!");
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("Cliente no ha sido creado correctamente :(");
        }
    }

    public void buscarCliente(Connection cn, String cedula){
        String sql = "SELECT * FROM  cliente WHERE cedulaCli = " + "'" + cedula + "';";
        Statement stmt;
        ResultSet rs;

        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            String nombre, email, telefono, direccion;

            if (rs.next()){
                nombre = rs.getString("nombreCli");
                email = rs.getString("emailCli");
                telefono = rs.getString("telefonoCli");
                direccion = rs.getString("direccionCli");
                System.out.println("---RESULTADOS DE LA BUSQUEDA---");
                System.out.println("nombre = " + nombre + " email = " + email + " telefono = " + telefono + " direccion = " + direccion);
            }else{
                System.out.println("No se encontraron resultados.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String retornarDireccion(Connection cn, String idCliente){
        String direccion = "";
        String sql = "SELECT * FROM cliente WHERE cedulaCli = '" + idCliente + "';";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                direccion = rs.getString("direccionCli");
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("Usuario no registrado.");
            return "";
        }
        return direccion;
    }
}
