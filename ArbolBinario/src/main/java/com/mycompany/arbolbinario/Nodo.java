/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author SCIS2-13
 */
class Nodo {
    Producto producto;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(Producto producto) {
        this.producto = producto;
        this.izquierda = null;
        this.derecha = null;
    }
}
