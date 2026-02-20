/*
 * TEMA 7: FUNCIONES Y MÉTODOS - EJERCICIO 5
 * ==========================================
 * Escriba un programa que calcule el máximo y mínimo de un arreglo usando funciones.
 */

import java.util.Arrays;

public class Tema7_Ejercicio5 {
    
    static int obtenerMaximo(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    static int obtenerMinimo(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    static double obtenerPromedio(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }
    
    public static void main(String[] args) {
        int[] numeros = {45, 23, 78, 12, 89, 56, 34, 90, 11, 67};
        
        System.out.println("=== ESTADÍSTICAS DEL ARREGLO ===");
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        System.out.println("Máximo: " + obtenerMaximo(numeros));
        System.out.println("Mínimo: " + obtenerMinimo(numeros));
        System.out.printf("Promedio: %.2f%n", obtenerPromedio(numeros));
    }
}

/*
 * SALIDA ESPERADA:
 * === ESTADÍSTICAS DEL ARREGLO ===
 * Arreglo: [45, 23, 78, 12, 89, 56, 34, 90, 11, 67]
 * Máximo: 90
 * Mínimo: 11
 * Promedio: 50.50
 */
