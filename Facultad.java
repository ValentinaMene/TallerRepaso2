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
public class Facultad {
    
    private String nombre;
    private int num_oficina;
    private int telefono;
    private String nombredecano;

    public Facultad(String nombre, int num_oficina, int telefono, String nombredecano) {
        this.nombre = nombre;
        this.num_oficina = num_oficina;
        this.telefono = telefono;
        this.nombredecano = nombredecano;
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

    public String getNombredecano() {
        return nombredecano;
    }

    public void setNombredecano(String nombredecano) {
        this.nombredecano = nombredecano;
    }

    
    
}
