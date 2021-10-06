/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Raton extends DispositivoEntrada{
    private static int id_Raton;
    private static int contadorRaton;
    
    //CONST

    public Raton(String tipoEntrada, String marca) {
         super(tipoEntrada, marca);
         RatonContador();
    }
    
    
    public void RatonContador() {
         this.id_Raton=++Raton.contadorRaton;
    }
    
}
