/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author Hernan Grados
 */
public class FacturaThread extends Thread {

    @Override
    public void run() {
        System.out.println("🧾 Generando factura en hilo paralelo: " + getName());
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        System.out.println("🧾 Factura lista (simulada).");
    }
}
