/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hernan Grados
 */
public class Pedido {
    public String cliente;
    public String producto;
    public int cantidad;
    public double subtotal;
    public double impuesto;
    public double total;

    public Pedido(String cliente, String producto, int cantidad, double subtotal, double impuesto, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }
}