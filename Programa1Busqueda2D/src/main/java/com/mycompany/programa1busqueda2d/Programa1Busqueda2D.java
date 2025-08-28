/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1busqueda2d;

/**
 *
 * @author Soluciones
 */
public class Programa1Busqueda2D {

    public static void main(String[] args) {
        int[][] matriz = {            // Declaración e inicialización de la matriz 3x3
            {5, 8, 3},
            {1, 7, 9},
            {4, 2, 6}
        };

        // Valor a buscar
        int valorBuscado = 1;

        // Llamada al método de búsqueda
        int[] posicion = buscarValor(matriz, valorBuscado);

        // Mostrar resultado
        if (posicion[0] != -1) {
            System.out.println("Valor encontrado en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor no encontrado en la matriz.");
        }
    }

    // Método para buscar un valor en la matriz 2D
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    return new int[]{fila, columna};
                }
            }
        }
        return new int[]{-1, -1}; // No encontrado
    }
}
