/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Hernan Grados
 */
public class StockService {
        public boolean validarStock(String producto, int cantidad) {
        return cantidad > 0; // Simple: 1 unidad siempre disponible
    }
}
