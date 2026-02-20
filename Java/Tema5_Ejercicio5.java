/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 5
 * ========================================
 * Escriba un programa que invierta un arreglo.
 */

import java.util.Arrays;

public class Tema5_Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        
        System.out.println("=== ARREGLO ORIGINAL ===");
        System.out.println(Arrays.toString(numeros));
        
        // Método 1: Invertir con bucle
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        
        System.out.println("\n=== ARREGLO INVERTIDO (copia) ===");
        System.out.println(Arrays.toString(invertido));
        
        // Método 2: Invertir in-situ
        int[] numeros2 = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros2.length / 2; i++) {
            int temp = numeros2[i];
            numeros2[i] = numeros2[numeros2.length - 1 - i];
            numeros2[numeros2.length - 1 - i] = temp;
        }
        
        System.out.println("\n=== ARREGLO INVERTIDO (in-situ) ===");
        System.out.println(Arrays.toString(numeros2));
    }
}

/*
 * SALIDA ESPERADA:
 * === ARREGLO ORIGINAL ===
 * [10, 20, 30, 40, 50]
 * 
 * === ARREGLO INVERTIDO (copia) ===
 * [50, 40, 30, 20, 10]
 * 
 * === ARREGLO INVERTIDO (in-situ) ===
 * [50, 40, 30, 20, 10]
 */
