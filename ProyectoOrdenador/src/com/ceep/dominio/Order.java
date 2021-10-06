/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Order {

    private int id_Order;
    Computador computadores[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static int maxComputadoras = 3;

    //CONSTR
    public Order() {
    }

    //METODOS
    public void agregarComputadora(Computador pc) {
        if (Order.contadorComputadoras < maxComputadoras) {
            computadores[Order.contadorComputadoras++] = pc;
        } else {
            System.out.println("Maximo de ordenadores permitidos");
        }
    }

    
    public void mostrarOrder() {
        System.out.println("Id_Orden: " + this.id_Order);
        for (int i = 0; i < Order.contadorComputadoras; i++) {
            System.out.println("- Nombre de la computadora " + i + " : " + computadores[i].getNombre());
            System.out.println("- Id de la computadora " + i + " : " + computadores[i].getId_Computadora());
            System.out.println("- Monitor de la computadora " + i + " : " + computadores[i].getMonitores());
            System.out.println("- Raton de la computadora " + i + " : " + computadores[i].getRatones());
            System.out.println("- Teclado de la computadora " + i + " : " + computadores[i].getTeclados());
        }
    }

}
