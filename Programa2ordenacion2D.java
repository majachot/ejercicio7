/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2ordenacion2d;

/**
 *
 * @author Soluciones
 */


import java.util.Arrays;

public class Programa2ordenacion2D {
    public static void main(String[] args) {
        // Matriz 3x3 de enteros
        int[][] matriz = {
            {9, 3, 5},
            {1, 7, 2},
            {6, 4, 8}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Ordenar la segunda fila (índice 1)
        int filaAOrdenar = 2;
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz después de ordenar la fila " + filaAOrdenar + ":");
        mostrarMatriz(matriz);
    }

    // Método para ordenar una fila específica usando Arrays.sort
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]);
        } else {
            System.out.println("Índice de fila fuera de rango.");
        }
    }

    // Método para mostrar la matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
   


