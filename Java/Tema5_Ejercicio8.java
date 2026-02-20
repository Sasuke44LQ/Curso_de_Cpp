/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 8
 * ========================================
 * Escriba un programa que trabaje con matrices (arreglos 2D).
 */

import java.util.Arrays;

public class Tema5_Ejercicio8 {
    public static void main(String[] args) {
        // Crear matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("=== MATRIZ 3x3 ===");
        
        // Imprimir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Calcular suma de elementos
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        
        System.out.println("\n=== SUMA DE ELEMENTOS ===");
        System.out.println("Suma total: " + suma);
        
        // Suma por filas
        System.out.println("\n=== SUMA POR FILAS ===");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }
        
        // Suma diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("\nSuma diagonal principal: " + sumaDiagonal);
    }
}

/*
 * SALIDA ESPERADA:
 * === MATRIZ 3x3 ===
 * 1 2 3 
 * 4 5 6 
 * 7 8 9 
 * 
 * === SUMA DE ELEMENTOS ===
 * Suma total: 45
 * 
 * === SUMA POR FILAS ===
 * Fila 0: 6
 * Fila 1: 15
 * Fila 2: 24
 * 
 * Suma diagonal principal: 15
 */
