/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import Facade.PedidoFacade;

public class PedidoThread extends Thread {

    private final PedidoFacade facade;
    private final String cliente;
    private final String producto;
    private final int cantidad;
    private final double precio;

    public PedidoThread(PedidoFacade facade, String cliente, String producto, int cantidad, double precio) {
        this.facade = facade;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public void run() {
        System.out.println("Procesando pedido en hilo: " + getName());
        facade.procesarPedido(cliente, producto, cantidad, precio);
    }
}
