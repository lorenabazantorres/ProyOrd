/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno mañana
 */
public class Computador {

    private final int id_Computadora;
    private String nombre;
    Monitor monitores;
    Teclado teclados;
    Raton ratones;
    private static int contComput;
    //metodo agregar monitores

    //CONSTR

    public Computador() {
         this.id_Computadora = ++contComput;
    }
    
    public Computador(String nombre, Monitor monitores, Teclado teclados, Raton ratones) {
        this();
        this.nombre = nombre;
        this.monitores = monitores;
        this.teclados = teclados;
        this.ratones = ratones;
    }

    @Override
    public String toString() {
        return "\t - id_Computadora : " + id_Computadora +  "\t - Nombre : " + nombre + "\t - Monitores : " + monitores + "\t - Teclados : " + teclados + "\t - Ratones : " + ratones;
    }

    public int getId_Computadora() {
        return id_Computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitor monitores) {
        this.monitores = monitores;
    }

    public Teclado getTeclados() {
        return teclados;
    }

    public void setTeclados(Teclado teclados) {
        this.teclados = teclados;
    }

    public Raton getRatones() {
        return ratones;
    }

    public void setRatones(Raton ratones) {
        this.ratones = ratones;
    }

}
