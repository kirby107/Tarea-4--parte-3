/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author Hernan Grados
 */
public class NotificacionThread extends Thread {

    @Override
    public void run() {
        System.out.println("Enviando notificaciones en hilo: " + getName());
        try { Thread.sleep(800); } catch (InterruptedException e) {}
        System.out.println("Notificaciones enviadas.");
    }
}
