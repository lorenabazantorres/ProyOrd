/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Monitor extends Computador {

    private static int id_monitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitor;

    public void MonitorCont() {
        this.id_monitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
        MonitorCont();
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Monitor{" + "id_monitor=" + id_monitor + ", marca=" + marca + ", tamano=" + tamaño + ", contadorMonitor=" + contadorMonitor + '}';
    }

    //G&S
    public int getId_monitor() {
        return id_monitor;
    }

    public void setId_monitor(int id_monitor) {
        this.id_monitor = id_monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitor() {
        return contadorMonitor;
    }

    public void setContadorMonitor(int contadorMonitor) {
        this.contadorMonitor = contadorMonitor;
    }

}
