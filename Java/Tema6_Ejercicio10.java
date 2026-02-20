/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 10
 * ==============================================
 * Escriba un programa que compare cadenas y ordene un arreglo de cadenas.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Tema6_Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== COMPARACIÓN Y ORDENAMIENTO DE CADENAS ===");
        
        // Ejemplo 1: Compararse
        System.out.println("\n--- Comparación ---");
        String cadena1 = "apple";
        String cadena2 = "banana";
        
        System.out.println("Cadena 1: '" + cadena1 + "'");
        System.out.println("Cadena 2: '" + cadena2 + "'");
        System.out.println("¿Son iguales? " + cadena1.equals(cadena2));
        System.out.println("CompareTo: " + cadena1.compareTo(cadena2));
        
        // Ejemplo 2: Ordenamiento
        System.out.println("\n--- Ordenamiento ---");
        String[] palabras = {"python", "java", "javascript", "c++", "ruby", "php"};
        
        System.out.println("Original: " + Arrays.toString(palabras));
        
        Arrays.sort(palabras);
        System.out.println("Ordenado (A-Z): " + Arrays.toString(palabras));
        
        // Ordenar al revés
        String[] palabrasReverso = {"python", "java", "javascript", "c++", "ruby", "php"};
        Arrays.sort(palabrasReverso);
        System.out.println("Ordenado (Z-A): ");
        for (int i = palabrasReverso.length - 1; i >= 0; i--) {
            System.out.print(palabrasReverso[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}

/*
 * SALIDA ESPERADA:
 * === COMPARACIÓN Y ORDENAMIENTO DE CADENAS ===
 * 
 * --- Comparación ---
 * Cadena 1: 'apple'
 * Cadena 2: 'banana'
 * ¿Son iguales? false
 * CompareTo: -1
 * 
 * --- Ordenamiento ---
 * Original: [python, java, javascript, c++, ruby, php]
 * Ordenado (A-Z): [c++, java, javascript, php, python, ruby]
 * Ordenado (Z-A): 
 * ruby python php javascript java c++
 */
