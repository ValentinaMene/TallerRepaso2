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
public class ListaProfesor {
    
    private String nombre_completo;
    private String correo;

    public ListaProfesor(String nombre_completo, String correo) {
        this.nombre_completo = nombre_completo;
        this.correo = correo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
