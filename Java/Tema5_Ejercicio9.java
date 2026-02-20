/*
 * TEMA 5: ARREGLOS Y LISTAS - EJERCICIO 9
 * ========================================
 * Escriba un programa que cuente la frecuencia de elementos en un arreglo.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tema5_Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        
        System.out.println("=== FRECUENCIA DE ELEMENTOS ===");
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        
        // Método 1: Usando HashMap
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }
        
        System.out.println("\n=== CONTEO POR ELEMENTO ===");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " veces");
        }
        
        // Encontrar elemento más frecuente
        int elementoMasFrecuente = -1;
        int maxFrecuencia = 0;
        
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                elementoMasFrecuente = entry.getKey();
            }
        }
        
        System.out.println("\nElemento más frecuente: " + elementoMasFrecuente + 
                         " (aparece " + maxFrecuencia + " veces)");
    }
}

/*
 * SALIDA ESPERADA:
 * === FRECUENCIA DE ELEMENTOS ===
 * Arreglo: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5]
 * 
 * === CONTEO POR ELEMENTO ===
 * Número 1: 1 veces
 * Número 2: 2 veces
 * Número 3: 3 veces
 * Número 4: 4 veces
 * Número 5: 5 veces
 * 
 * Elemento más frecuente: 5 (aparece 5 veces)
 */
