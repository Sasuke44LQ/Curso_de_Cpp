/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 4
 * ========================================
 * Escriba un programa que ordene un arreglo en orden ascendente.
 */

import java.util.Arrays;

public class Tema5_Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90, 33, 55, 44};
        
        System.out.println("=== ARREGLO ORIGINAL ===");
        System.out.println(Arrays.toString(numeros));
        
        // Ordenamiento de burbuja (bubble sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\n=== ARREGLO ORDENADO ===");
        System.out.println(Arrays.toString(numeros));
        
        // Forma rápida usando Arrays.sort()
        int[] numeros2 = {64, 34, 25, 12, 22, 11, 90, 33, 55, 44};
        Arrays.sort(numeros2);
        System.out.println("\n=== USANDO Arrays.sort() ===");
        System.out.println(Arrays.toString(numeros2));
    }
}

/*
 * SALIDA ESPERADA:
 * === ARREGLO ORIGINAL ===
 * [64, 34, 25, 12, 22, 11, 90, 33, 55, 44]
 * 
 * === ARREGLO ORDENADO ===
 * [11, 12, 22, 25, 33, 34, 44, 55, 64, 90]
 * 
 * === USANDO Arrays.sort() ===
 * [11, 12, 22, 25, 33, 34, 44, 55, 64, 90]
 */
