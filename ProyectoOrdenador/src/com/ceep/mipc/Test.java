/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.mipc;

//IMPORTAR
import com.ceep.dominio.*;

/**
 *
 * @author Alumno mañana
 */
public class Test {

    public static void main(String[] args) {
        //OBJETOS  
        //PC

        Teclado t1 = new Teclado("USB", "Corsair");
        Raton r1 = new Raton("USB", "Razer");
        Monitor m1 = new Monitor("LG", 27.0);
        Computador c1 = new Computador("Gaming", m1, t1, r1);

        //PEDIDIO
        Order p1 = new Order();

        //METEMOS LOS ORDENADORES EN EL PEDIDO
        p1.agregarComputadora(c1);
    }
}
