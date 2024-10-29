/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author SCIS2-13
 */
public class Producto {
    private String color;
    private String tamaño;
    private String marca;

    public Producto(String color, String tamaño, String marca) {
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getMarca() {
        return marca;
    }
}
