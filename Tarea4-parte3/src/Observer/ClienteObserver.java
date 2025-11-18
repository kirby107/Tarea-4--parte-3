/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Hernan Grados
 */
public class ClienteObserver extends Observador {

    private final String nombre;

    public ClienteObserver(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("📢 Cliente " + nombre + " notificado: " + mensaje);
    }
}
