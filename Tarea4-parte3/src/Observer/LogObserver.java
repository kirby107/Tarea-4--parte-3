/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Hernan Grados
 */
public class LogObserver extends Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("LOG DEL SISTEMA: " + mensaje);
    }
}