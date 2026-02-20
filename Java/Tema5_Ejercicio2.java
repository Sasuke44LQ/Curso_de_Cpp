/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 2
 * ========================================
 * Escriba un programa que encuentre el número mayor y menor en un arreglo.
 */

import java.util.Arrays;

public class Tema5_Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {45, 23, 12, 89, 56, 34, 78, 90, 11, 67};
        
        System.out.println("=== ARREGLO ===");
        System.out.println(Arrays.toString(numeros));
        
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Rango: " + (mayor - menor));
    }
}

/*
 * SALIDA ESPERADA:
 * === ARREGLO ===
 * [45, 23, 12, 89, 56, 34, 78, 90, 11, 67]
 * 
 * === RESULTADOS ===
 * Mayor: 90
 * Menor: 11
 * Rango: 79
 */
