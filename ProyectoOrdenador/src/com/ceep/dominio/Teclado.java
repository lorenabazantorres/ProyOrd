/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Teclado extends DispositivoEntrada{
    private static int id_Teclado;
    private static int contadorTeclado;
    
    //CONSTR

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        TecladoContador();
    }
    
    
    public void TecladoContador() {
         this.id_Teclado=++Teclado.contadorTeclado;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Teclado{" + "id_Teclado=" + id_Teclado;
    }
    
}
