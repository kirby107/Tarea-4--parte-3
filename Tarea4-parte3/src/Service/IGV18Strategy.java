/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Hernan Grados
 */
public class IGV18Strategy extends ImpuestoStrategy {
        @Override
    public double calcular(double subtotal) {
        return subtotal * 0.18;
    }
}
