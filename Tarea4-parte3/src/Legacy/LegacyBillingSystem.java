/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Legacy;

/**
 *
 * @author Hernan Grados
 */
public class LegacyBillingSystem {
     public void emitirFactura(String cliente, String detalle, double monto) {
        System.out.println("[LEGACY] Factura emitida: " + cliente + " - " + detalle + " - Total: " + monto);
    }
}
