/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4.parte3;

import Facade.PedidoFacade;
import Adapter.FacturaAdapter;
import Service.IGV18Strategy;

import Observer.*;
import Threads.*;

public class Tarea4Parte3 {
    public static void main(String[] args) {
     PedidoFacade Facade = new PedidoFacade(new FacturaAdapter());
        Facade.setImpuestoStrategy(new IGV18Strategy());

        Facade.agregarObservador(new ClienteObserver("Juan Pérez"));
        Facade.agregarObservador(new InventarioObserver());
        Facade.agregarObservador(new LogObserver());

        PedidoThread pedidoThread = new PedidoThread(Facade, "Juan Pérez", "Laptop", 1, 2500);
        FacturaThread facturaThread = new FacturaThread();
        NotificacionThread notifThread = new NotificacionThread();

        pedidoThread.start();
        facturaThread.start();
        notifThread.start();
    }
    
}
