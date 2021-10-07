/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Teclado extends DispositivoEntrada {

    private final int id_Teclado;
    private static int contadorTeclado;

    //CONSTR
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.id_Teclado = ++Teclado.contadorTeclado;

    }

    @Override
    public String toString() {
        //TOSTRING DE LA CLASE PADRE
        return super.toString() + "\n\t-> id_Teclado : " + id_Teclado;
    }

}
