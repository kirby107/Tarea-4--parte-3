/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.List;
import Model.Pedido;

public class PedidoRepository {
    
    private final List<Pedido> pedidos = new ArrayList<>();

    public void guardar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("💾 Pedido guardado en repositorio.");
    }

    public List<Pedido> obtenerTodos() {
        return pedidos;
    }
}
