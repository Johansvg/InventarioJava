package com.mycompany.inventario;

import java.sql.*;

public class Connection {
    
    public java.sql.Connection conexionBD(){
        java.sql.Connection conection = null;
        String host = "jdbc:mysql://127.0.0.1:3306/";
        String user = "root";
        String pass = "";
        String bd = "Inventario";
        System.out.println("Conectando con la base de datos...");
        
        try{
            conection = DriverManager.getConnection(host+bd, user, pass);
            System.out.println("Conexion Exitosa!!!");
        }catch (SQLException e){
            System.out.println("Hubo un problema al realizar la conexion: " + e.getMessage());
        }
        return conection;
    }
    
    public void desconectarBD(java.sql.Connection cn){
        try{
            cn.close();
            System.out.println("Desconexion exitosa!!!");
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al realizar la desconexion: " + e.getMessage());
        }
    }
}
