package com.mycompany.inventario;

import java.sql.Date;

public class Pedido {
    private int idPedido;
    private Date fechaEntrega;
    private double valorPedido;
    private boolean pagado;

    public Pedido(int idPedido, Date fechaEntrega, double valorPedido, boolean pagado) {
        this.idPedido = idPedido;
        this.fechaEntrega = fechaEntrega;
        this.valorPedido = valorPedido;
        this.pagado = pagado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
}
