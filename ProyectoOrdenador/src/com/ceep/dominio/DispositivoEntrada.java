/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class DispositivoEntrada {
//ATRIBUTOS
//LA CLASE PADRE NO TIENE ATRIBUTOS PRIVADOS, SINO PROTECTED PARA QUE LAS CLASES HIJAS ACCEDAN A ESOS ATRIBUTOS
    protected String tipoEntrada;
    protected String marca;

    //CONSTRUCTORES
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    
    //TOSTRING
    @Override
    public String toString() {
        return "\t\n - Tipo de entrada : " + tipoEntrada + "\t\n - Marca : " + marca;
    }

    //G&S
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
