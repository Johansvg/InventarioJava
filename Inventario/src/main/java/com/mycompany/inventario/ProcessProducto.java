package com.mycompany.inventario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessProducto {
    
    public void crearProducto(Connection cn, int idProd, String nombreProd, String marcaProd, int cantidadProd, double precio) {
        String sql = "INSERT INTO producto (idProd, nombreProd, marcaProd, cantidadProd, precioProd) VALUES (" + "'" + idProd + "'," + "'" + nombreProd + "'," + "'" + marcaProd + "'," + "'" + cantidadProd + "'," + precio +");";
        Statement stmt;
        try {
            stmt = cn.createStatement();
            int filasAfectadas = stmt.executeUpdate(sql);
            System.out.println("Row Affected: " + filasAfectadas);
            System.out.println("Producto creado exitosamente !!!!");
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("El producto no ha sido creado correctamente :(");
        }
    }

    public int retornarExistencias(Connection cn, int idProd){
        String sql = "SELECT * FROM producto WHERE idProd = '" + idProd+ "';";
        Statement stmt;
        ResultSet rs;
        int existencias = 0;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                existencias = rs.getInt("cantidadProd");
                return existencias;
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("No se ha encontrado el producto");
        }
        return existencias;
    }

    public double retornarPrecio(Connection cn, int idProd){
        String sql = "SELECT * FROM producto WHERE idProd = '" + idProd+ "';";
        Statement stmt;
        ResultSet rs;
        double precio = 0;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                precio = rs.getInt("precioProd");
                return precio;
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("No de ha encontrado el producto");
        }
        return precio;
    }

    public void actualizarExistencias(Connection cn, int existenciasActuales, int idProd){
        String sql = "UPDATE producto SET cantidadProd = " + existenciasActuales + " WHERE idprod = " + idProd + ";";
        Statement stmt;

        try {
            stmt = cn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Producto actualizado!!!");
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            System.out.println("Producto no actualizado");
        }
    }

    public double venderProducto(Connection cn, int idProd, int cantidadVenta){
        int restante;
        double precio;
        int existencias_actuales = retornarExistencias(cn, idProd);
        if (cantidadVenta > existencias_actuales || existencias_actuales == 0){
            System.out.println("Producto no disponible");
            return 0;
        }
        restante = existencias_actuales - cantidadVenta;
        System.out.println("Existencias restantes: " + restante);
        actualizarExistencias(cn, restante, idProd);
        precio = retornarPrecio(cn, idProd) * cantidadVenta;
        return precio;
    }
    
    public boolean verificarProducto(Connection cn, int id){
        String sql = "SELECT * FROM producto WHERE idProd = " + id + ";";
        Statement stmt;
        ResultSet rs;
        
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("No se ha podido realizar la conexion");
        }
        return false;
    }
}
