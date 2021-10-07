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
    private final int id_Raton;
    private static int contadorRaton;
    
    //CONST

    public Raton(String tipoEntrada, String marca) {  
        //Accedo desde la clase hija a los atributos de la clase padre
         super(tipoEntrada, marca);
          this.id_Raton=++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        //TOSTRING DE LA CLASE PADRE
        return super.toString() + "\n\t-> id_Raton : " + id_Raton;
    }
   
    
}
