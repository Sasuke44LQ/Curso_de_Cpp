/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 1
 * ========================================
 * Escriba un programa que cree un arreglo de 5 números y los imprima.
 */

import java.util.Scanner;

public class Tema5_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear arreglo
        int[] numeros = new int[5];
        
        System.out.println("=== LECTURA DE ARREGLO ===");
        System.out.println("Ingrese 5 números:");
        
        // Llenar arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar arreglo
        System.out.println("\n=== ARREGLO INGRESADO ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === LECTURA DE ARREGLO ===
 * Ingrese 5 números:
 * Número 1: 10
 * Número 2: 20
 * Número 3: 30
 * Número 4: 40
 * Número 5: 50
 * 
 * === ARREGLO INGRESADO ===
 * Índice 0: 10
 * Índice 1: 20
 * Índice 2: 30
 * Índice 3: 40
 * Índice 4: 50
 */
