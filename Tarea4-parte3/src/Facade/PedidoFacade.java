package Facade;

import Service.*;
import Adapter.FacturaService;
import Model.Pedido;

import Observer.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoFacade extends Sujeto {

    private final StockService stock = new StockService();
    private final PedidoRepository repo = new PedidoRepository();
    private final FacturaService factura;

    private ImpuestoStrategy impuesto;

    private final List<Observador> observadores = new ArrayList<>();

    public PedidoFacade(FacturaService factura) {
        this.factura = factura;
    }

    public void setImpuestoStrategy(ImpuestoStrategy impuesto) {
        this.impuesto = impuesto;
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void procesarPedido(String cliente, String producto, int cantidad, double precio) {

        if (!stock.validarStock(producto, cantidad)) {
            System.out.println("❌ Stock insuficiente");
            return;
        }

        double subtotal = cantidad * precio;
        double igv = impuesto.calcular(subtotal);
        double total = subtotal + igv;

        Pedido pedido = new Pedido(cliente, producto, cantidad, subtotal, igv, total);
        repo.guardar(pedido);

        notificarObservadores("Pedido generado → Cliente: " + cliente + ", Producto: " + producto);

        factura.generarFactura(cliente, producto, total);

        notificarObservadores("Factura generada por total: " + total);

        System.out.println("✅ Pedido procesado con éxito.");
    }
}