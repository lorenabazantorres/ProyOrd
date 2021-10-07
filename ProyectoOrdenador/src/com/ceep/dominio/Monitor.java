/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */


public class Monitor{
//ATRIBUTOS
    private final int id_monitor;
    private String marca;
    private double tamano;
    private static int contadorMonitor;

    public Monitor() {
        this.id_monitor = ++contadorMonitor;
    }

    public Monitor(String marca, double tamano) {
        //Llamo al constructor vacío en el que le asigno un id
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "\t\n - Marca : " + marca + "\t\n - Tamaño : " + tamano ;
    }

    //G&S
    public int getId_monitor() {
        return id_monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamano;
    }

    public void setTamaño(double tamaño) {
        this.tamano = tamaño;
    }

    public int getContadorMonitor() {
        return contadorMonitor;
    }

    public void setContadorMonitor(int contadorMonitor) {
        this.contadorMonitor = contadorMonitor;
    }

}
