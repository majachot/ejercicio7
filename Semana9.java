/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana9;

/**
 *
 * @author Soluciones
 */
public class Semana9 {

    public static void main(String[] args) {
        int [][] matriz = {
              {5,6,8},
              {9,7,10}
        };
        System.out.println("elementos de la matriz");
        
        for(int i = 0; i <= matriz.length; i++){
        for(int j = 0; j <= matriz.length; j++){
        System.out.print(matriz[i][j]+ " ");
        }
        System.out.println();
        }
            
        
    }
}
