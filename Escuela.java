/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerrepaso2;

/**
 *
 * @author valem
 */
public class Escuela {
    
    private String nombre;
    private int num_oficina;
    private int telefono;
    private String nombredirector;

    public Escuela(String nombre, int num_oficina, int telefono, String nombredirector) {
        this.nombre = nombre;
        this.num_oficina = num_oficina;
        this.telefono = telefono;
        this.nombredirector = nombredirector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_oficina() {
        return num_oficina;
    }

    public void setNum_oficina(int num_oficina) {
        this.num_oficina = num_oficina;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombredirector() {
        return nombredirector;
    }

    public void setNombredirector(String nombredirector) {
        this.nombredirector = nombredirector;
    }
    
    
}
