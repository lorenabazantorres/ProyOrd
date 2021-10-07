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

    private final int id_Order;
    Computador computadores[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 3;

    //CONSTR
    public Order() {
        computadores = new Computador[Order.maxComputadoras]; //se crea un array con un length del maximo
        this.id_Order = ++Order.contadorOrdenes; //Creo un nuevo pedido y se le asigna un valor
        contadorComputadoras = 0; //Reiniciar el contador de productos de cada pedido
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
//            System.out.println(computadores[i]);
            System.out.println("Nombre de la computadora : " + computadores[i].getNombre());
            System.out.println("Id de la computadora : " + computadores[i].getId_Computadora());
            System.out.println("Monitor : " + computadores[i].getMonitores());
            System.out.println("Raton : " + computadores[i].getRatones());
            System.out.println("Teclado : " + computadores[i].getTeclados());
        }
    }

}
