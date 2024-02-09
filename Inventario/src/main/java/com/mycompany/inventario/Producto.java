package com.mycompany.inventario;

public class Producto {
    private int idProducto, existencias;
    private String nombreProducto, marcaProducto;

    //Constructor completo
    public Producto(int idProducto, int existencias, String nombreProducto, String marcaProducto) {
        this.idProducto = idProducto;
        this.existencias = existencias;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
    }

    //Constructor faltante direccion
    public Producto(int idProducto, int existencias, String nombreProducto) {
        this.idProducto = idProducto;
        this.existencias = existencias;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = "x";
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }
    
    
    
    
}
