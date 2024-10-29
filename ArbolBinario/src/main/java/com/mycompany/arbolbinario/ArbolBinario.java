/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;

/**
 *
 * @author SCIS2-13
 */
import java.util.ArrayList;
import java.util.List;

class ArbolBinario {
    private Nodo raiz;
    private int nivelMaximo = 5;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean insertar(Producto producto) {
        if (raiz == null) {
            raiz = new Nodo(producto);
            return true;
        }
        return insertarRecursivo(raiz, producto, 1);
    }

    private boolean insertarRecursivo(Nodo nodo, Producto producto, int nivelActual) {
        if (nivelActual >= nivelMaximo) {
            return false; // No se puede insertar más allá del nivel máximo
        }

        if (producto.getMarca().compareTo(nodo.producto.getMarca()) < 0) {
            if (nodo.izquierda == null) {
                nodo.izquierda = new Nodo(producto);
                return true;
            } else {
                return insertarRecursivo(nodo.izquierda, producto, nivelActual + 1);
            }
        } else {
            if (nodo.derecha == null) {
                nodo.derecha = new Nodo(producto);
                return true;
            } else {
                return insertarRecursivo(nodo.derecha, producto, nivelActual + 1);
            }
        }
    }

    public List<Producto> buscarSimilares(Producto producto) {
        List<Producto> similares = new ArrayList<>();
        buscarSimilaresRecursivo(raiz, producto, similares);
        return similares;
    }

    private void buscarSimilaresRecursivo(Nodo nodo, Producto producto, List<Producto> similares) {
        if (nodo != null) {
            if (nodo.producto.getColor().equals(producto.getColor()) || 
                nodo.producto.getTamaño().equals(producto.getTamaño())) {
                similares.add(nodo.producto);
            }
            buscarSimilaresRecursivo(nodo.izquierda, producto, similares);
            buscarSimilaresRecursivo(nodo.derecha, producto, similares);
        }
    }
}